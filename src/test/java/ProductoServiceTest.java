package com.hotelddj.hotel_ddj_api.service;

import com.hotelddj.hotel_ddj_api.entity.Producto;
import com.hotelddj.hotel_ddj_api.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductoServiceTest {

    @Mock
    private ProductoRepository repository;

    @InjectMocks
    private ProductoService service;

    @Test
    void listarProductos() {

        Producto producto = Producto.builder()
                .id(1L)
                .nombre("Jabón")
                .descripcion("Jabón líquido")
                .stock(10)
                .precio(12000.0)
                .build();

        when(repository.findAll()).thenReturn(List.of(producto));

        List<Producto> productos = service.listar();

        assertEquals(1, productos.size());
        assertEquals("Jabón", productos.get(0).getNombre());
    }
}