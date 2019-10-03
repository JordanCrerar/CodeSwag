package com.fluidmatterdevelopment.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.adapters.ProductsAdaptor
import com.fluidmatterdevelopment.coderswag.services.DataService
import com.fluidmatterdevelopment.coderswag.utility.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adaptor: ProductsAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adaptor = ProductsAdaptor(this, DataService.getProducts(categoryType))

        val orientation: Int = resources.configuration.orientation
        val spanCount: Int = (if (orientation == Configuration.ORIENTATION_LANDSCAPE ||
                resources.configuration.screenWidthDp > 720) 3 else 2)

        val layoutManager = GridLayoutManager(this, spanCount)
        rvProducts.layoutManager = layoutManager
        rvProducts.adapter = adaptor
    }
}
