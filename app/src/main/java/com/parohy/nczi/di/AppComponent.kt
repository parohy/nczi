package com.parohy.nczi.di

import com.parohy.nczi.BackgroundService
import com.parohy.nczi.MainActivity
import dagger.Component

@Component(modules = [ApiModule::class])
interface AppComponent {
    fun injectMain(service: BackgroundService)
}