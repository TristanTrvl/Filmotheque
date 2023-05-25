package fr.eni.movielibrary.bll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Participant;

@Service
@Profile("dev")
public class MovieServiceMock implements MovieService {
    // Attributs static pour gérer les valeurs à afficher
    private static List<Movie> movies;
    private static List<Genre> genres;
    private static List<Participant> participants;

    private static final String[] mockGenres = { "Animation", "Science-fiction", "Documentaire", "Action", "Comédie", "Drame" };

    public MovieServiceMock() {
        // Création de la liste des mockGenres
        genres = new ArrayList<>();
        for (int index = 0; index < mockGenres.length; index++) {
            genres.add(new Genre(index + 1, mockGenres[index]));
        }

        // Création de la liste des participants
        participants = new ArrayList<>();
        // 2 réalisateurs dont 1 pour 2 films
        Participant stevenSpielberg = new Participant(1, "Spielberg", "Steven");
        Participant davidCronenberg = new Participant(2, "Cronenberg", "David");
        participants.add(stevenSpielberg);
        participants.add(davidCronenberg);

        // 2 acteurs par film et l'un d'eux dans 2 films
        Participant richardAttenborough = new Participant(3, "Attenborough", "Richard");
        Participant jeffGoldblum = new Participant(4, "Goldblum", "Jeff");
        List<Participant> actorsJurassicPark = new ArrayList<>();
        actorsJurassicPark.add(richardAttenborough);
        actorsJurassicPark.add(jeffGoldblum);
        participants.addAll(actorsJurassicPark);

        Participant geenaDavis = new Participant(5, "Davis", "Geena");
        List<Participant> actorsTheFly = new ArrayList<>();
        actorsTheFly.add(jeffGoldblum);
        actorsTheFly.add(geenaDavis);
        participants.add(geenaDavis);

        Participant markRylance = new Participant(6, "Rylance", "Mark");
        Participant rubyBarnhill = new Participant(7, "Barnhill", "Ruby");
        List<Participant> actorsTheBFG = new ArrayList<>();
        actorsTheBFG.add(markRylance);
        actorsTheBFG.add(rubyBarnhill);
        participants.addAll(actorsTheBFG);

        // Création de la liste de films
        // 3 films
        movies = new ArrayList<>();
        Movie jurassicPark = new Movie(1, "Jurassic Park", 1993, 128, "Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant à ramener à la vie des dinosaures grâce au clonage.");
        jurassicPark.setGenre(genres.get(1));
        jurassicPark.setDirector(stevenSpielberg);
        jurassicPark.setActors(actorsJurassicPark);
        movies.add(jurassicPark);

        Movie theFly = new Movie(2, "The Fly", 1986, 95, "Il s'agit de l'adaptation cinématographique de la nouvelle éponyme de l'auteur George Langelaan.");
        theFly.setGenre(genres.get(1));
        theFly.setDirector(davidCronenberg);
        theFly.setActors(actorsTheFly);
        movies.add(theFly);

        Movie theBFG = new Movie(3, "The BFG", 2016, 117, "Le Bon Gros Géant est un géant bien différent des autres habitants du Pays des Géants.");
        theBFG.setGenre(genres.get(4));
        theBFG.setDirector(stevenSpielberg);
        theBFG.setActors(actorsTheBFG);
        movies.add(theBFG);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public Movie getMovieById(long id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public List<Genre> getGenres() {
        return genres;
    }

    @Override
    public List<Participant> getParticipants() {
        return participants;
    }

    @Override
    public Genre getGenreById(long id) {
        for (Genre genre : genres) {
            if (genre.getId() == id) {
                return genre;
            }
        }
        return null;
    }

    @Override
    public Participant getParticipantById(long id) {
        for (Participant participant : participants) {
            if (participant.getId() == id) {
                return participant;
            }
        }
        return null;
    }

    @Override
    public void saveMovie(Movie movie) {
        movies.add(movie);
    }
}