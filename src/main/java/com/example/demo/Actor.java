package com.example.demo;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by oracle on 8/14/17.
 */

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String name;

    private String realname;

    @ManyToMany(mappedBy = "cast")
    private Set<Movie> movies;

    // Getters and Setters
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
