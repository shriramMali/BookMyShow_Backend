package com.example.JustTicket.Service;

import com.example.JustTicket.Dtos.UserRequestDto;
import com.example.JustTicket.Models.UserEntity;
import com.example.JustTicket.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto){

        //Converted the userRequestDto to UserEntity
        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();

        try{
            userRepository.save(userEntity);

        }catch(Exception e){
            return "user couldnt be added";
        }
        return "User added sucessfully";
    }

    public UserEntity findUser(String name){
            List<UserEntity> userEntities=userRepository.findAll();

            for(UserEntity user:userEntities){
                if(user.getName().equals(name))
                    return user;
            }

        return null;
    }

    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }

}
