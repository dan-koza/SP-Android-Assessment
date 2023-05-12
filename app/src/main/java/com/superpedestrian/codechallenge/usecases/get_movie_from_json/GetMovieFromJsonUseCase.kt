package com.superpedestrian.codechallenge.usecases.get_movie_from_json

import com.superpedestrian.codechallenge.models.Movie
import com.superpedestrian.codechallenge.repositories.Resource

interface GetMovieFromJsonUseCase {

    operator fun invoke(jsonMovie: String): Resource<Movie>
}