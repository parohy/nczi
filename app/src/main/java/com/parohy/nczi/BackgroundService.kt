package com.parohy.nczi

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.util.Log
import com.parohy.nczi.di.ApiService
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class BackgroundService: Service() {
    companion object {
        private const val TAG = "BackgroundService"
    }
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    @Inject
    lateinit var apiService: ApiService

    override fun onCreate() {
        super.onCreate()

        application.diComponent().injectMain(this)

        apiService.getData()
            .subscribeOn(Schedulers.io())
            .subscribe({

            }, {
                Log.e(TAG, it.toString())
            }).toDisposables()
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()

        compositeDisposable.dispose()
    }

    fun Disposable.toDisposables() {
        compositeDisposable.add(this)
    }
}