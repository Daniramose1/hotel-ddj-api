package com.hotelddj.hotel_ddj_api.service;

import com.hotelddj.hotel_ddj_api.entity.Reserva;
import com.hotelddj.hotel_ddj_api.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public List<Reserva> listar() {
        return repository.findAll();
    }

    public Reserva buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Reserva guardar(Reserva reserva) {
        return repository.save(reserva);
    }

    public Reserva actualizar(Long id, Reserva reserva) {
        Reserva existente = repository.findById(id).orElse(null);

        if (existente != null) {
            existente.setFechaEntrada(reserva.getFechaEntrada());
            existente.setFechaSalida(reserva.getFechaSalida());
            existente.setCliente(reserva.getCliente());
            existente.setHabitacion(reserva.getHabitacion());

            return repository.save(existente);
        }

        return null;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}