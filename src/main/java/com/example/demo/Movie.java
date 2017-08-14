package com.example.demo;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by oracle on 8/14/17.
 */

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String title;

    private long year;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "MOVIE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ACTOR_ID", referencedColumnName = "ID"))
    private Set<Actor> cast;

    // Getters and Setters
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Actor> getCast() {
        return cast;
    }

    public void setCast(Set<Actor> cast) {
        this.cast = cast;
    }
}
