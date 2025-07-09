package com.minsait.ejercicio_hexagonal.application.compras.command;

import java.util.List;

import org.springframework.stereotype.Service;

import com.minsait.ejercicio_hexagonal.application.compras.dto.ProductoCantidadDTO;
import com.minsait.ejercicio_hexagonal.application.productos.exception.ProductoNotFoundException;
import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.out.GetClientePort;
import com.minsait.ejercicio_hexagonal.domain.compras.exception.ClienteNotValidException;
import com.minsait.ejercicio_hexagonal.domain.compras.exception.ProductosNotValidException;
import com.minsait.ejercicio_hexagonal.domain.compras.model.ItemVenta;
import com.minsait.ejercicio_hexagonal.domain.compras.model.Venta;
import com.minsait.ejercicio_hexagonal.domain.compras.port.in.CreateVentaUsecase;
import com.minsait.ejercicio_hexagonal.domain.compras.port.out.CreateVentaPort;
import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;
import com.minsait.ejercicio_hexagonal.domain.productos.port.out.LoadAllProductosPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateVentaService implements CreateVentaUsecase{

    private final CreateVentaPort saveVentaport;
    private final GetClientePort getClientePort;
    private final LoadAllProductosPort loadAllProductosPort;
    @Override
    public Venta createVenta(Long clienteId, List<ProductoCantidadDTO> productosIds) {
     Cliente cliente = getClientePort.getClienteById(clienteId)
        .orElseThrow(() -> new ClienteNotValidException());

    List<ItemVenta> items = productosIds.stream()
        .map(p -> {
            Producto producto = loadAllProductosPort.getProductoById(p.getProductoId())
                .orElseThrow(() -> new ProductoNotFoundException(p.getProductoId()));
            return new ItemVenta(producto, p.getCantidad());
        })
        .toList();

    if (items.isEmpty()) {
        throw new ProductosNotValidException();
    }

    Venta venta = new Venta(null, cliente, items);
    return saveVentaport.saveVenta(venta);
    }

}
