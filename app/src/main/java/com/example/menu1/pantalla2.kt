package com.example.menu1

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class pantalla2 : AppCompatActivity() {

    private lateinit var buttonPlay: Button
    private lateinit var buttonPause: Button
    private lateinit var buttonStop: Button

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        buttonPlay = findViewById(R.id.buttonPlay)
        buttonPause = findViewById(R.id.buttonPause)
        buttonStop = findViewById(R.id.buttonStop)

        mediaPlayer = MediaPlayer.create(this, R.raw.movie)

        setOnClickListeners(this)
    }

    private fun setOnClickListeners(context: Context) {
        buttonPlay.setOnClickListener {
            mediaPlayer.start()
            Toast.makeText(context, "Reproduciendo...", Toast.LENGTH_SHORT).show()
        }

        buttonPause.setOnClickListener {
            mediaPlayer.pause()
            Toast.makeText(context, "En pausa...", Toast.LENGTH_SHORT).show()
        }

        buttonStop.setOnClickListener {
            mediaPlayer.stop()
            mediaPlayer = MediaPlayer.create(context, R.raw.movie)
            Toast.makeText(context, "Parando...", Toast.LENGTH_SHORT).show()
        }
    }
}