package com.example.activitychecklistapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var mainRecycler: RecyclerView
    private lateinit var searchBtn: ImageButton
    private lateinit var moreBtn: ImageButton
    private lateinit var addActivityBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        mainRecycler = findViewById(R.id.mainRecycler)
        searchBtn = findViewById(R.id.searchBtn)
        moreBtn = findViewById(R.id.moreBtn)
        addActivityBtn = findViewById(R.id.addActivityBtn)

        mainRecycler.layoutManager = LinearLayoutManager(this)
        mainRecycler.adapter = rcAdapter()



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}