package com.fluidmatterdevelopment.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fluidmatterdevelopment.coderswag.R
<<<<<<< HEAD
<<<<<<< HEAD

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
=======
import com.fluidmatterdevelopment.coderswag.adapters.CategoryAdapter
=======
import com.fluidmatterdevelopment.coderswag.adapters.CategoryRecycleAdaptor
>>>>>>> recyclerAddapter
import com.fluidmatterdevelopment.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {

    //lateinit vars/vals
    lateinit var adapter: CategoryRecycleAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        adapter = CategoryAdapter(this, DataService.categories)
        lvCategory.adapter = adapter
>>>>>>> lesson
=======
        adapter = CategoryRecycleAdaptor(this, DataService.categories)
        rvCategory.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        rvCategory.layoutManager = layoutManager
        rvCategory.setHasFixedSize(true)


>>>>>>> recyclerAddapter
    }
}
