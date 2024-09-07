package com.example.demo.service;

import com.example.demo.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final List<Producto> productos = new ArrayList<>();

    public List<Producto> getAllProductos() {
        return productos;
    }

    public Optional<Producto> getProductoById(Long id) {
        return productos.stream().filter(producto -> producto.getId().equals(id)).findFirst();
    }

    public Producto saveProducto(Producto producto) {
        productos.add(producto);
        return producto;
    }

    public Optional<Producto> updateProducto(Long id, Producto newProducto) {
        return getProductoById(id).map(producto -> {
            producto.setNombre(newProducto.getNombre());
            producto.setPrecio(newProducto.getPrecio());
            return producto;
        });
    }

    public boolean deleteProducto(Long id) {
        return productos.removeIf(producto -> producto.getId().equals(id));
    }
}