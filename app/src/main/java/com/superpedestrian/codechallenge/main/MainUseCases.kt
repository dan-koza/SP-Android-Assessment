package com.superpedestrian.codechallenge.main

import com.superpedestrian.codechallenge.usecases.get_movie_from_json.GetMovieFromJsonUseCase

data class MainUseCases(
    val getMovieFromJsonUseCase: GetMovieFromJsonUseCase
)