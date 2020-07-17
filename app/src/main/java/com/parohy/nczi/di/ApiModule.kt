package com.parohy.nczi.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiModule {
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://postman-echo.com")
            .build()
    }

    @Singleton
    @Provides
    fun providesApiAService(): ApiService = retrofit.create(ApiService::class.java)
}