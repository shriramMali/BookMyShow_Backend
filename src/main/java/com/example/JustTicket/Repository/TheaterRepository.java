package com.example.JustTicket.Repository;

import com.example.JustTicket.Models.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {

    TheaterEntity findByNameAndCity(String name, String city);
}

