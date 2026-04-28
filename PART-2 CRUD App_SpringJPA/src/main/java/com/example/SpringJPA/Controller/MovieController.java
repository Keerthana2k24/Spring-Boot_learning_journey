package com.example.SpringJPA.Controller;

import com.example.SpringJPA.Model.Movie;
import com.example.SpringJPA.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieservice;

  @GetMapping("/Movie")
  public List<Movie> printAllMovies(){
      return movieservice.printAllMovies();
  }

  @PostMapping("/Movie")
    public String addmovies(@RequestBody Movie movie){
       movieservice.addmovies(movie);
      return "Added";
    }
    @PutMapping("/Movie")
    public String updatemovie(@RequestBody Movie movie){
      movieservice.updatemovie(movie);
      return "updated";
    }
    @DeleteMapping("/Movie")
    public String Deletemovie(@RequestBody Movie movie){
        movieservice.Deletemovie(movie);
        return "Deleted";
    }
    @DeleteMapping("/Movie/clear")
    public String clearallmovie(){
        movieservice.clearallmovie();
        return "Cleared";
    }
    @GetMapping("/Movie/{Title}")
    public ResponseEntity<Movie> findbyTitle(@PathVariable String Title){
        Movie m= movieservice.findbyTitle(Title);
        if(m==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(m,HttpStatus.OK);
    }

    @PostMapping("/Movie/filter-data")
    public List<Movie> findbygenreanddirector(@RequestParam ("genre") String genre, @RequestParam ("director") String director){
      return movieservice.findbygenreanddirector(genre,director);
    }
}
