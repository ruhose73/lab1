package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.lab1.StringExc


class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
    }

    fun stringsExercise(view: View){
        val exercise = StringExc()
        var max = exercise.smt()
        textView.text = max
    }
}
