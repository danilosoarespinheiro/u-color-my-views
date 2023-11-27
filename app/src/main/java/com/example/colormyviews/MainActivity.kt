package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.run {

            val clickableViews: List<View> =
                listOf(
                    boxOne,
                    boxTwo,
                    boxThree,
                    boxFour,
                    boxFive,
                    constraintLayout,
                    redButton,
                    yellowButton,
                    greenButton
                )

            for (item in clickableViews) {
                item.setOnClickListener { makeColored(it) }
            }
        }
    }

    private fun makeColored(view: View?) {
        binding.let {
            when (view?.id) {
                it.boxOne.id -> view.setBackgroundColor(Color.DKGRAY)
                it.boxTwo.id -> view.setBackgroundColor(Color.GRAY)

                it.boxThree.id -> view.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        android.R.color.holo_green_light
                    )
                )

                it.boxFour.id -> view.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        android.R.color.holo_green_dark
                    )
                )

                it.boxFive.id -> view.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        android.R.color.holo_green_light
                    )
                )

                it.redButton.id -> it.boxThree.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.my_red
                    )
                )

                it.yellowButton.id -> it.boxFour.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.my_yellow
                    )
                )

                it.greenButton.id -> it.boxFive.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.my_green
                    )
                )

                else -> view?.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
}