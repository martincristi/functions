package com.example.functions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        artist()
        genre()
        year()
    }
    val artist = "Doc"
    val genre = "Hip Hop"
    val yearReleased = 2019

    fun artist(): String{
        return artist
    }
    fun genre(): String{
        return genre
    }
    fun year(): Int{
        return yearReleased
    }
}