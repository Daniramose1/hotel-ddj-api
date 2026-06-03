package com.hotelddj.hotel_ddj_api.service;

import com.hotelddj.hotel_ddj_api.entity.Habitacion;
import com.hotelddj.hotel_ddj_api.repository.HabitacionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HabitacionServiceTest {

    @Mock
    private HabitacionRepository repository;

    @InjectMocks
    private HabitacionService service;

    @Test
    void listarHabitaciones() {

        Habitacion habitacion = Habitacion.builder()
                .id(1L)
                .numero("101")
                .tipo("Sencilla")
                .precio(120000.0)
                .disponible(true)
                .build();

        when(repository.findAll()).thenReturn(List.of(habitacion));

        List<Habitacion> habitaciones = service.listar();

        assertEquals(1, habitaciones.size());
        assertEquals("101", habitaciones.get(0).getNumero());
    }
}