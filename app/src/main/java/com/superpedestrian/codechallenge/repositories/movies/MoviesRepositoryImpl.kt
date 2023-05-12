package com.superpedestrian.codechallenge.repositories.movies

import com.superpedestrian.codechallenge.models.Movie
import com.superpedestrian.codechallenge.models.MovieJson
import com.superpedestrian.codechallenge.repositories.Resource

class MoviesRepositoryImpl: MoviesRepository {

    override fun getMovie(title: String): Resource<Movie> {
        return Resource.Error(message = "Fetching $title hasn't been implemented yet")
    }

    override fun getMovieFromJson(movieJson: String): Resource<Movie> {
        return try {
            val movie = MovieJson.toMovie(movieJson)
            Resource.Success(data = movie)
        } catch (e: java.lang.Exception) {
            Resource.Error(message = e.message)
        }
    }
}