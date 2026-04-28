package com.example.SpringJPA.Service;

import com.example.SpringJPA.Model.Movie;
import com.example.SpringJPA.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepo movierepo;
    public List<Movie> printAllMovies() {
        return movierepo.findAll();
    }

    public void addmovies(Movie movie) {
      movierepo.save(movie);

    }

    public void updatemovie(Movie movie) {
        movierepo.save(movie);
    }

    public void Deletemovie(Movie movie) {
        movierepo.delete(movie);
    }

    public void clearallmovie() {
        movierepo.deleteAll();
    }

    public Movie findbyTitle(String Title) {
        return movierepo.findByTitle(Title).orElse(null);
    }

    public List<Movie> findbygenreanddirector(String genre, String director) {
        return movierepo.findByGenreAndDirector(genre,director);
    }
}
