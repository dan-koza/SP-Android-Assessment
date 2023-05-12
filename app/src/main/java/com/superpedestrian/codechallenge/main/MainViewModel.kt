package com.superpedestrian.codechallenge.main

import androidx.lifecycle.ViewModel
import com.superpedestrian.codechallenge.models.Movie
import com.superpedestrian.codechallenge.models.MovieJson
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.random.Random

class MainViewModel: ViewModel() {

    private val movies = listOf(MovieJson.THE_GODFATHER, MovieJson.THE_SHAWSHANK_REDEMPTION, MovieJson.THE_AVENGERS)

    sealed class MainState {
        object None : MainState()
        data class NewMovie(val movie: Movie) : MainState()
    }
}