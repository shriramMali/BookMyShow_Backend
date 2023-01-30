package com.example.JustTicket.Repository;

import com.example.JustTicket.Models.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {
}
