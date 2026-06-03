package com.hotelddj.hotel_ddj_api.repository;

import com.hotelddj.hotel_ddj_api.entity.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {
}