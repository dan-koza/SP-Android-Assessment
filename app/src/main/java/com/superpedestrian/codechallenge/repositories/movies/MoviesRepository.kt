package com.superpedestrian.codechallenge.repositories.movies

import com.superpedestrian.codechallenge.models.Movie
import com.superpedestrian.codechallenge.repositories.Resource

interface MoviesRepository {

    fun getMovie(title: String): Resource<Movie>

    fun getMovieFromJson(movieJson: String): Resource<Movie>
}