package com.bookmyshow.service;


import com.bookmyshow.model.Movies;
import com.bookmyshow.repository.MoveisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MoveisRepository moveisRepository;

    //add movies

    public Movies addMovie(Movies movies){
        return this.moveisRepository.save(movies);
    }

    //get all movies
    public List<Movies>getAllMovies(){
        return this.moveisRepository.findAll();
    }

    //search movie
    public Movies SearchMovie(Integer movieId){
        Movies movie=this.moveisRepository.findById(movieId).get();
        return movie;

    }

    //delete movie

    public void deleteMoive(Integer movieId){
        this.moveisRepository.deleteById(movieId);
    }

    //update movie info

    public Movies updateMovieInfo(Movies newMovieInfo,Integer movieId){
        Movies oldMovieInfo=this.moveisRepository.findById(movieId).get();
        oldMovieInfo.setMovieName(newMovieInfo.getMovieName());
        oldMovieInfo.setLocation(newMovieInfo.getLocation());
        oldMovieInfo.setLanguage(newMovieInfo.getLanguage());
        oldMovieInfo.setDuration(newMovieInfo.getDuration());
        oldMovieInfo.setTicketPrice(newMovieInfo.getTicketPrice());

        return oldMovieInfo;
    }



}
