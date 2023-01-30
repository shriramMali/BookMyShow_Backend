package com.example.JustTicket.Repository;

import com.example.JustTicket.Models.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
}
