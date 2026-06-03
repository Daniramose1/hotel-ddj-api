package com.hotelddj.hotel_ddj_api.repository;

import com.hotelddj.hotel_ddj_api.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}