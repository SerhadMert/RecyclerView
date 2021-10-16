package com.example.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.DataAdapter
import com.example.recyclerview.data.DataHelper

class MainActivity : AppCompatActivity() {

    val dataAdapter by lazy { DataAdapter(DataHelper.getDataList()) }
    val recyclerView by lazy { findViewById<RecyclerView>(R.id.recycler_data) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.adapter = dataAdapter
    }
}