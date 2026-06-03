package com.hotelddj.hotel_ddj_api.service;

import com.hotelddj.hotel_ddj_api.entity.Habitacion;
import com.hotelddj.hotel_ddj_api.repository.HabitacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionService {

    private final HabitacionRepository repository;

    public HabitacionService(HabitacionRepository repository) {
        this.repository = repository;
    }

    public List<Habitacion> listar() {
        return repository.findAll();
    }

    public Habitacion guardar(Habitacion habitacion) {
        return repository.save(habitacion);
    }

    public Habitacion buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Habitacion actualizar(Long id, Habitacion habitacion) {

        Habitacion existente = repository.findById(id).orElse(null);

        if (existente != null) {

            existente.setNumero(habitacion.getNumero());
            existente.setTipo(habitacion.getTipo());
            existente.setPrecio(habitacion.getPrecio());
            existente.setDisponible(habitacion.getDisponible());

            return repository.save(existente);
        }

        return null;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}