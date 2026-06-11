package com.example.SpringJPA.Repository;

import com.example.SpringJPA.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer>{
Optional<Movie> findByTitle(String Title);
@Query(nativeQuery = true, value="select * from movie where genre=:genre and director=:director")
List<Movie> findByGenreAndDirector(@Param("genre") String genre, @Param("director") String director);
}
