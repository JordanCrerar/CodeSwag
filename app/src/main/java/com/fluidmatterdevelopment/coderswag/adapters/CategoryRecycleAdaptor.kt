package com.fluidmatterdevelopment.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.model.Category

class CategoryRecycleAdaptor(private val context: Context, private val categories: List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdaptor.RvHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_list_item, parent, false)
        return RvHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(Rvholder: RvHolder, position: Int) {
        Rvholder?.bindCategory(categories[position],context)
    }

    //required class. Inherits from RecyclerView.ViewHolder
    inner class RvHolder(itemView: View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.ivCategory)
        val categoryName = itemView?.findViewById<TextView>(R.id.tvCategory)

        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
            categoryName?.text = category.title
            categoryImage?.setImageResource(resourceId)
            itemView.setOnClickListener { itemClick(category) }

        }
    }
}