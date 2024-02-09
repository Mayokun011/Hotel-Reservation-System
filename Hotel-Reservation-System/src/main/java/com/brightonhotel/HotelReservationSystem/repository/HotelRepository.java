package com.brightonhotel.HotelReservationSystem.repository;

import com.brightonhotel.HotelReservationSystem.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository <Hotel, Long>{
}
