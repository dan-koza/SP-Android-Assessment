package com.superpedestrian.codechallenge.usecases.get_movie_from_json

import com.superpedestrian.codechallenge.models.Movie
import com.superpedestrian.codechallenge.repositories.Resource
import com.superpedestrian.codechallenge.repositories.movies.MoviesRepository

class GetMovieFromJsonUseCaseImpl(private val moviesRepository: MoviesRepository): GetMovieFromJsonUseCase {

    override fun invoke(jsonMovie: String): Resource<Movie> {
        return moviesRepository.getMovieFromJson(jsonMovie)
    }
}