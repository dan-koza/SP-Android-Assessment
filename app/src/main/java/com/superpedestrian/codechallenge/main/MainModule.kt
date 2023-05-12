package com.superpedestrian.codechallenge.main

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    factory{ MainUseCases(get()) }
    viewModel { MainViewModel() }
}