package com.bookmyshow.controller;


import com.bookmyshow.model.Movies;
import com.bookmyshow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public List<Movies>getAllMovies(){
        return this.movieService.getAllMovies();
    }

    @PostMapping("/addMovie")
    public Movies addNewMovie(@RequestBody Movies movie){
        return this.movieService.addMovie(movie);
    }

    @PutMapping("/updateMovieInfo/{movieId}")
    public Movies updateMovieInfo(@RequestBody Movies movie,@PathVariable Integer movieId){
        return this.movieService.updateMovieInfo(movie,movieId);
    }

    @DeleteMapping("deleteMoive/{movieId}")
    public void deleteMovie(@PathVariable Integer movieId){
        this.movieService.deleteMoive(movieId);
    }

    @GetMapping("/search/{movieId}")
    public Movies SearchMovie(@PathVariable Integer movieId){
        return this.movieService.SearchMovie(movieId);

    }
}
