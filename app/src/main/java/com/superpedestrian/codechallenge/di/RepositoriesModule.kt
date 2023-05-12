package com.superpedestrian.codechallenge.di

import com.superpedestrian.codechallenge.repositories.movies.MoviesRepository
import com.superpedestrian.codechallenge.repositories.movies.MoviesRepositoryImpl
import org.koin.dsl.module

val repositoriesModule = module {
    factory<MoviesRepository> { MoviesRepositoryImpl() }
}