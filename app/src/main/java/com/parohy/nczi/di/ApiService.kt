package com.parohy.nczi.di

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("/time/object")
    fun getData(): Observable<Model>
}