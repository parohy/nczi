package com.parohy.nczi

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ResultReceiver(): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.extras?.getString(MainActivity.RESULT_KEY)?.also {
            //TODO: send text
        }
    }
}