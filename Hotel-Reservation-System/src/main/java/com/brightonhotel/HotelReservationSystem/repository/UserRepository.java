package com.brightonhotel.HotelReservationSystem.repository;

import com.brightonhotel.HotelReservationSystem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Long>{

}