package com.fluidmatterdevelopment.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.model.Catagory

class CategoryAdapter(private val context: Context, private val categories: List<Catagory>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        val categoryView: View =
            LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.ivCategory)
        val categoryName : TextView = categoryView.findViewById(R.id.tvCategory)

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",
            context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        categoryName.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}