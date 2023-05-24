package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {

    private long id;
    private String title;
    private int year;
    private int duration;
    private String synopsis;
    private Participant director;
    private List<Participant> actors;
    private List<Review> opinions;
    private Genre genre;

    public Movie() {}

    public Movie(int id, String title, int year, int duration, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.synopsis = synopsis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Participant getDirector() {
        return director;
    }

    public void setDirector(Participant director) {
        this.director = director;
    }

    public List<Participant> getActors() {
        return actors;
    }

    public void setActors(List<Participant> actors) {
        this.actors = actors;
    }

    public List<Review> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Review> opinions) {
        this.opinions = opinions;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
