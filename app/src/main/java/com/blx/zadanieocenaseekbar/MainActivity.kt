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

        var max = 300
        var min = 1


//<============================== Jabko ==============================>
        seekbar_jablko_h?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                jablko.scaleX = (seek.progress/100).toFloat()
                progressBar_h.progress = seekbar_granat_h.progress + seekbar_gruszka_h.progress + seekbar_jablko_h.progress
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        seekbar_jablko_v?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                jablko.scaleY = (seek.progress/100).toFloat()
                progressBar_v.progress = seekbar_granat_v.progress + seekbar_gruszka_v.progress + seekbar_jablko_v.progress
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

//<============================== Granat ==============================>

        seekbar_granat_h?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                granat.scaleX = (seek.progress/100).toFloat()
                progressBar_h.progress = seekbar_granat_h.progress + seekbar_gruszka_h.progress + seekbar_jablko_h.progress
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        seekbar_granat_v?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                granat.scaleY = (seek.progress/100).toFloat()
                progressBar_v.progress = seekbar_granat_v.progress + seekbar_gruszka_v.progress + seekbar_jablko_v.progress
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

//<============================== Gruszka ==============================>

        seekbar_gruszka_h?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                gruszka.scaleX = (seek.progress/100).toFloat()
                progressBar_h.progress = seekbar_granat_h.progress + seekbar_gruszka_h.progress + seekbar_jablko_h.progress
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        seekbar_gruszka_v?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                gruszka.scaleY = (seek.progress/100).toFloat()
                progressBar_v.progress = seekbar_granat_v.progress + seekbar_gruszka_v.progress + seekbar_jablko_v.progress
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
}
}
fun Refresh_ProgressBar() : Unit{

}