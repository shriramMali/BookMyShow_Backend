package com.example.JustTicket.Controller;


import com.example.JustTicket.Dtos.TheaterRequestDto;
import com.example.JustTicket.Models.TheaterEntity;
import com.example.JustTicket.Service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public String addTheater(@RequestBody TheaterRequestDto theaterRequestDto){

        return theaterService.createTheater(theaterRequestDto);

    }

    //Get theaters by theaterId
    @GetMapping("/getById")
    public TheaterEntity getTheaterById(int id){
        return theaterService.getTheaterById(id);
    }

    //Get all theaters
}
