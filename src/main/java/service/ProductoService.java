package com.hotelddj.hotel_ddj_api.service;

import com.hotelddj.hotel_ddj_api.entity.Producto;
import com.hotelddj.hotel_ddj_api.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> listar() {
        return repository.findAll();
    }

    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }

    public Producto buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Producto actualizar(Long id, Producto producto) {

        Producto existente = repository.findById(id).orElse(null);

        if (existente != null) {

            existente.setNombre(producto.getNombre());
            existente.setDescripcion(producto.getDescripcion());
            existente.setStock(producto.getStock());
            existente.setPrecio(producto.getPrecio());
            existente.setCategoria(producto.getCategoria());

            return repository.save(existente);
        }

        return null;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}