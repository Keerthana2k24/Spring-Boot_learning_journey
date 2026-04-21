package com.example.Service;

import com.example.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class MovieService {
    List<Movie> movie=new ArrayList<>(
            Arrays.asList(new Movie(1,"Inception","sci-fi","Christoper nolan"),
                    new Movie(2,"Enthiren","Action","Shankar")));

    public List<Movie> list(){
        return movie;
    }
    int inx=0;
    Boolean flag=false;
    public String listbyid(int id) {
        for(int i=0;i<movie.size();i++){
            if(movie.get(i).getId()==id){
                inx=i;
                flag=true;
                break;
            }

        }
        if(!flag) {
            return "ID does not exist";
        }
        else {
            movie.get(inx);
        return "Got it!!";
        }
    }
    public void addnew(Movie m){
        movie.add(m);

    }

    public String makeupdate(Movie m) {
        int inx=0;
        Boolean flag=false;
        for(int i=0;i<movie.size();i++){
            if(movie.get(i).getId()==m.getId()){
                inx=i;
                flag=true;
                break;
            }

        }
        if(!flag){
            return "Data not found";
        }
        else{
            movie.set(inx,m);
            return "Updated";
        }

    }

    public String delete(int id) {
        int inx=0;
        Boolean flag=false;
        for(int i=0;i<movie.size();i++){
            if(movie.get(i).getId()==id){
                inx=i;
                flag=true;
                break;
            }

        }
        if(!flag){
            return "Not exist";
        }
        else{
            movie.remove(inx);
            return "Removed";
        }

    }
    }


