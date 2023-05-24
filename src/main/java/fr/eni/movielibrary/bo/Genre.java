package fr.eni.movielibrary.bo;

import java.util.List;

public class Genre {

    private long id;
    private String label;
    private List<Movie> movies;

    public Genre(long id, String label) {
        this.id = id;
        this.label = label;
    }

    public Genre() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
