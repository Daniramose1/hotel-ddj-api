package com.hotelddj.hotel_ddj_api.controller;

import com.hotelddj.hotel_ddj_api.entity.Habitacion;
import com.hotelddj.hotel_ddj_api.service.HabitacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    private final HabitacionService service;

    public HabitacionController(HabitacionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Habitacion> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Habitacion buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Habitacion guardar(@RequestBody Habitacion habitacion) {
        return service.guardar(habitacion);
    }

    @PutMapping("/{id}")
    public Habitacion actualizar(
            @PathVariable Long id,
            @RequestBody Habitacion habitacion) {

        return service.actualizar(id, habitacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}