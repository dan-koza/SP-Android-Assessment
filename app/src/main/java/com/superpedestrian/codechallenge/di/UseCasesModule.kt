package com.superpedestrian.codechallenge.di

import com.superpedestrian.codechallenge.usecases.get_movie_from_json.GetMovieFromJsonUseCase
import com.superpedestrian.codechallenge.usecases.get_movie_from_json.GetMovieFromJsonUseCaseImpl
import org.koin.dsl.module

val useCasesModule = module {
    factory<GetMovieFromJsonUseCase> { GetMovieFromJsonUseCaseImpl(get()) }
}