package com.example.JustTicket.Service;

import com.example.JustTicket.Dtos.MovieRequestDto;
import com.example.JustTicket.Models.MovieEntity;
import com.example.JustTicket.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequestDto movieRequestDto){

        //Convert Dto to Entity layer for saving it to the Database.
        MovieEntity movie = MovieEntity.builder().movieName(movieRequestDto.getName()).duration(movieRequestDto.getDuration()).releaseDate(movieRequestDto.getReleaseDate()).build();

        movieRepository.save(movie);

        return "Movie Added successfully";
    }

    public MovieEntity getByName(String name){

        List<MovieEntity> movies=movieRepository.findAll();
        for(MovieEntity movie:movies) {
            if(movie.getMovieName()==name)  return movie;
        }
        return null;
    }
}