package com.hotelddj.hotel_ddj_api.repository;

import com.hotelddj.hotel_ddj_api.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}