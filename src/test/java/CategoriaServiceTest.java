package com.hotelddj.hotel_ddj_api.service;

import com.hotelddj.hotel_ddj_api.entity.Categoria;
import com.hotelddj.hotel_ddj_api.repository.CategoriaRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CategoriaServiceTest {

    @Mock
    private CategoriaRepository repository;

    @InjectMocks
    private CategoriaService service;

    public CategoriaServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listarCategorias() {

        Categoria categoria = Categoria.builder()
                .id(1L)
                .nombre("Cocina")
                .descripcion("Área de cocina")
                .build();

        when(repository.findAll())
                .thenReturn(List.of(categoria));

        List<Categoria> resultado = service.listar();

        assertEquals(1, resultado.size());
        assertEquals("Cocina", resultado.get(0).getNombre());
    }
}