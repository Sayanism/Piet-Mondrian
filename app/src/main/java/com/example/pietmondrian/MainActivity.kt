package com.example.pietmondrian

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews : List<Int> = listOf(
            R.id.box_one_text,
            R.id.box_two_text,
            R.id.box_three_text,
            R.id.box_four_text,
            R.id.box_five_text,
            R.id.button_red,
            R.id.button_blue,
            R.id.button_yellow
        )
        for(item in clickableViews) {
            findViewById<TextView>(item).setOnClickListener {
                makeColoured(it)
            }
        }
    }

    private fun makeColoured(view: View) {
        when(view.id) {

            //adding colours to boxes using Color class
            R.id.box_three_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)

            //adding colours to boxes using Android's Resource class Color
            R.id.box_one_text -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_two_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_red_dark)

            //adding colours to boxes by clicking buttons
            R.id.button_red -> {
                findViewById<TextView>(R.id.box_one_text).setBackgroundResource(R.color.red)
                findViewById<TextView>(R.id.box_four_text).setBackgroundResource(R.color.red)
            }
            R.id.button_yellow -> {
                findViewById<TextView>(R.id.box_three_text).setBackgroundResource(R.color.yellow)
                findViewById<TextView>(R.id.box_five_text).setBackgroundResource(R.color.yellow)
            }
            R.id.button_blue -> {
                findViewById<TextView>(R.id.box_two_text).setBackgroundResource(R.color.blue)
            }
        }
    }
}