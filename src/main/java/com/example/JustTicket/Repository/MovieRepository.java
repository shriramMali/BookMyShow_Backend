package com.example.JustTicket.Repository;

import com.example.JustTicket.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    MovieEntity findByMovieName(String movieName);

}