package fr.eni.movielibrary.bo;

import java.util.List;

public class Participant {

    private long id;
    private String firstName;
    private String lastName;
    private List<Movie> moviesAsActor;
    private List<Movie> moviesAsDirector;

    public Participant(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Participant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() { return lastName + " " + firstName; }

    public List<Movie> getMoviesAsActor() {
        return moviesAsActor;
    }

    public void setMoviesAsActor(List<Movie> moviesAsActor) {
        this.moviesAsActor = moviesAsActor;
    }

    public List<Movie> getMoviesAsDirector() {
        return moviesAsDirector;
    }

    public void setMoviesAsDirector(List<Movie> moviesAsDirector) {
        this.moviesAsDirector = moviesAsDirector;
    }
}
