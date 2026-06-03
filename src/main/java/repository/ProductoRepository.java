package com.hotelddj.hotel_ddj_api.repository;

import com.hotelddj.hotel_ddj_api.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}