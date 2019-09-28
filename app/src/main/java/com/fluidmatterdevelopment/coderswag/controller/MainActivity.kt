package com.fluidmatterdevelopment.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.model.Catagory
import com.fluidmatterdevelopment.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit vars/vals
    lateinit var adapter: ArrayAdapter<Catagory>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)
        lvCategory.adapter = adapter
    }
}
