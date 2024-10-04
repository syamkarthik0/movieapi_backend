package com.example.movieapi.controller;

import com.example.movieapi.entity.Movie;
import com.example.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Simple GET endpoint to test if the server is running
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

    // POST request to add movies using the Movie entity

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/movies")
    public String createMovie(@RequestBody Movie movie) {
        // Mock behavior: Simply print the movie object and return a success message
        System.out.println("Movie received: " + movie.toString());
        return "Movie added successfully!";
    }
}