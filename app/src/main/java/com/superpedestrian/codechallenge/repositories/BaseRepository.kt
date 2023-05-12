package com.superpedestrian.codechallenge.repositories

import retrofit2.Response

open class BaseRepository<T> {

    fun getResourceResult(response: Response<T>): Resource<T> {
        if (response.isSuccessful) {
            return Resource.Success(response.body())
        }
        return Resource.Error(response.message())
    }

    fun getResourceFailure(e: Exception): Resource<T> {
        return Resource.Error(e.message)
    }

}