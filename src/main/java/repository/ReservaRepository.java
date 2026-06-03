package com.hotelddj.hotel_ddj_api.repository;

import com.hotelddj.hotel_ddj_api.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}