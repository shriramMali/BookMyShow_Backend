package com.example.JustTicket.Controller;

import com.example.JustTicket.Dtos.MovieRequestDto;
import com.example.JustTicket.Models.MovieEntity;
import com.example.JustTicket.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto){

        return movieService.addMovie(movieRequestDto);
    }

    @GetMapping("/getByName")
    public MovieEntity getByName(String name){
        return movieService.getByName(name);
    }

}