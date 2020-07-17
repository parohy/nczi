package com.parohy.nczi

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    companion object {
        const val RESULT_KEY: String = "result"
    }

    private val receiver: ResultReceiver by lazy { ResultReceiver() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun updateText(text: String) {
        textResult.text = text
    }
}