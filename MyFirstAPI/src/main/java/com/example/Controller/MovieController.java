package com.example.Controller;

import com.example.Movie;
import com.example.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieservice;
    @GetMapping("/")
    public List<Movie> listofmovies(){
        return movieservice.list();
    }
    @GetMapping("/{id}")
    public String printbyid(@PathVariable int id){
        return movieservice.listbyid(id);
    }
    @PostMapping("Movie")
    public String addnew(@RequestBody Movie movie){
        movieservice.addnew(movie);
        return "Added";
    }
    @PutMapping("Movie")
    public String update(@RequestBody Movie movie){
       return movieservice.makeupdate(movie);

    }
    @DeleteMapping("Movie/{id}")
    public String delete(@PathVariable int id){
       return movieservice.delete(id);

    }
}
