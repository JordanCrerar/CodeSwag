package com.fluidmatterdevelopment.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.adapters.CategoryRecycleAdaptor
import com.fluidmatterdevelopment.coderswag.services.DataService
import com.fluidmatterdevelopment.coderswag.utility.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*


class  MainActivity : AppCompatActivity() {

    //lateinit vars & vals
    lateinit var adapter: CategoryRecycleAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdaptor(this, DataService.categories) { category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        rvCategory.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        rvCategory.layoutManager = layoutManager
        rvCategory.setHasFixedSize(true)

    }
}
