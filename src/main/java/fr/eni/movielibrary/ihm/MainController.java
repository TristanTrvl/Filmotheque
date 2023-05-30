package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Member;
import fr.eni.movielibrary.bo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
//@SessionAttributes({"loggedUser"})
public class MainController {
    private final MovieService movieService;

    @Autowired
    public MainController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Movie> movies = movieService.getAllMovies();

//        Member loggedUser = (Member) model.getAttribute("loggedUser");

        model.addAttribute("movies", movies);

        return "index";
    }
}
