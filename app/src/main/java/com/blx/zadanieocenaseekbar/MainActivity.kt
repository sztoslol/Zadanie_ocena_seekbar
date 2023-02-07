package com.blx.zadanieocenaseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var seekbar_jablko_h = findViewById<SeekBar>(R.id.seekBar_jablko_h)
        var seekbar_jablko_v = findViewById<SeekBar>(R.id.seekBar_jablko_v)
        var seekbar_granat_h = findViewById<SeekBar>(R.id.seekBar_granat_h)
        var seekbar_granat_v = findViewById<SeekBar>(R.id.seekBar_grabat_v)
        var seekbar_gruszka_h = findViewById<SeekBar>(R.id.seekBar_gruszka_h)
        var seekbar_gruszka_v = findViewById<SeekBar>(R.id.seekBar_gruszka_v)

        var progressBar_h = findViewById<ProgressBar>(R.id.progressBar_main_h)
        var progressBar_v = findViewById<ProgressBar>(R.id.progressBar_main_v)

        var jablko = findViewById<ImageView>(R.id.imageView_1_jabka)
        var granat = findViewById<ImageView>(R.id.imageView_2_granat)
        var gruszka = findViewById<ImageView>(R.id.imageView_3_gruszki)
    }
}