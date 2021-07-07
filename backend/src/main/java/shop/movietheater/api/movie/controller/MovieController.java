package shop.movietheater.api.movie.controller;
import shop.movietheater.api.movie.service.MovieServiceImpl;
import shop.movietheater.api.plex.domain.Plex;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.movietheater.api.movie.service.MovieServiceImpl;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController{
    private final MovieServiceImpl movieService;
}