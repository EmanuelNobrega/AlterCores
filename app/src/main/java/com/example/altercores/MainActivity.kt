package com.example.altercores

import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var TvColor: TextView
    private lateinit var Alpha: SeekBar
    private lateinit var RedColor: SeekBar
    private lateinit var GreenColor: SeekBar
    private lateinit var BlueColor: SeekBar

    var start = 0
    var end = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.TvColor = findViewById(R.id.TV_Color)
        this.Alpha = findViewById(R.id.Alpha)
        this.RedColor = findViewById(R.id.Red)
        this.GreenColor = findViewById(R.id.Green)
        this.BlueColor = findViewById(R.id.Blue)
        TvColor.setTextColor(Color.WHITE)
        TvColor.setBackgroundColor(Color.BLACK)

        this.Alpha.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                TvColor.setBackgroundColor(Color.argb(progress, this@MainActivity.RedColor.progress, this@MainActivity.GreenColor.progress, this@MainActivity.BlueColor.progress))
                TvColor.text = java.lang.Integer.toHexString(this@MainActivity.Alpha.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.RedColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.GreenColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.BlueColor.progress).toString()
                color()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    start = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    end = seekBar.progress
                }
            }

        })

        RedColor.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                TvColor.setBackgroundColor(Color.argb(this@MainActivity.Alpha.progress, progress, this@MainActivity.GreenColor.progress, this@MainActivity.BlueColor.progress))
                TvColor.text = java.lang.Integer.toHexString(this@MainActivity.Alpha.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.RedColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.GreenColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.BlueColor.progress).toString()
                color()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    start = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    end = seekBar.progress
                }
            }

        })

        this.GreenColor.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                TvColor.setBackgroundColor(Color.argb(this@MainActivity.Alpha.progress, this@MainActivity.RedColor.progress, progress, this@MainActivity.BlueColor.progress))
                TvColor.text = java.lang.Integer.toHexString(this@MainActivity.Alpha.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.RedColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.GreenColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.BlueColor.progress).toString()
                color()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    start = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    end = seekBar.progress
                }
            }

        })

        this.BlueColor.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                TvColor.setBackgroundColor(Color.argb(this@MainActivity.Alpha.progress, this@MainActivity.RedColor.progress, this@MainActivity.GreenColor.progress, progress))
                TvColor.text = java.lang.Integer.toHexString(this@MainActivity.Alpha.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.RedColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.GreenColor.progress).toString() + java.lang.Integer.toHexString(this@MainActivity.BlueColor.progress).toString()
                color()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    start = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null) {
                    end = seekBar.progress
                }
            }

        })

    }
    fun color(){
        if (this@MainActivity.RedColor.progress + this@MainActivity.GreenColor.progress + this@MainActivity.BlueColor.progress < 120 && this@MainActivity.Alpha.progress > 100){
            TvColor.setTextColor(Color.WHITE)
        }
        else{
            TvColor.setTextColor(Color.BLACK)
        }
    }


}
