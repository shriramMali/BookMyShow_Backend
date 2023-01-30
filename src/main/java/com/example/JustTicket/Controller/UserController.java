package com.example.JustTicket.Controller;

import com.example.JustTicket.Dtos.UserRequestDto;
import com.example.JustTicket.Models.UserEntity;
import com.example.JustTicket.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserRequestDto userRequestDto){
        return userService.createUser(userRequestDto);
    }


    @GetMapping("/get_by_name")
    public UserEntity findUser(@PathVariable String name){
        return userService.findUser(name);
    }

    @GetMapping("/get_all")
   public List<UserEntity> getALl(){
        return userService.getAll();
   }


}
