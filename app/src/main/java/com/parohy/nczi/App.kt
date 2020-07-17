package com.parohy.nczi

import android.app.Application
import com.parohy.nczi.di.AppComponent
import com.parohy.nczi.di.DaggerAppComponent

class App: Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }
}

fun Application.diComponent(): AppComponent = (this as App).appComponent