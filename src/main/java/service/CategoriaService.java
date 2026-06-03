package com.hotelddj.hotel_ddj_api.service;

import com.hotelddj.hotel_ddj_api.entity.Categoria;
import com.hotelddj.hotel_ddj_api.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria guardar(Categoria categoria) {
        return repository.save(categoria);
    }

    public Categoria buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Categoria actualizar(Long id, Categoria categoria) {

        Categoria existente = repository.findById(id).orElse(null);

        if (existente != null) {
            existente.setNombre(categoria.getNombre());
            existente.setDescripcion(categoria.getDescripcion());

            return repository.save(existente);
        }

        return null;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}