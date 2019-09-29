package com.fluidmatterdevelopment.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.adapters.CategoryAdapter
import com.fluidmatterdevelopment.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit vars/vals
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        lvCategory.adapter = adapter
    }
}
