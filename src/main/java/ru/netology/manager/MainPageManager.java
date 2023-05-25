package ru.netology.manager;

import ru.netology.domain.Movie;

public class MainPageManager {
    private MovieManager movieManager;

    public Movie[] generatePage() {
        Movie movies = movieManager.getMovieForFeed();
        return null;
    }
}
