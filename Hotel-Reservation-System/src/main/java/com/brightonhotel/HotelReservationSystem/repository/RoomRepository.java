package com.brightonhotel.HotelReservationSystem.repository;

import com.brightonhotel.HotelReservationSystem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository <Room, Long> {
}
