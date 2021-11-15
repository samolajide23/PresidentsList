package com.example.presidentslists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presidentsListView: RecyclerView = findViewById(R.id.presidents_list);

        val presidentsArray = resources.getStringArray(R.array.presidents)

        val presidentsListAdapter = PresidentsAdapter(presidentsArray)

        presidentsListView.adapter = presidentsListAdapter

    }
}