package com.example.moviedb_app.model;

import com.example.moviedb_app.presenter.MoviesPresenterImplementation;

public interface MoviesListInterface {
    public void getMovies(String searchText, MoviesPresenterImplementation moviesPresenter);
}
