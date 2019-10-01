package com.fluidmatterdevelopment.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.adapters.CategoryAdapter
import com.fluidmatterdevelopment.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {

    //lateinit vars/vals
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        rvCategory.adapter = adapter

        rvCategory.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You Clicked on the ${category.title} cell",
                Toast.LENGTH_SHORT).show()
        }
    }
}
