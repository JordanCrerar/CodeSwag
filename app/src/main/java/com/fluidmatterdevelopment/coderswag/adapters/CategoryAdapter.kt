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
        val categoryView: View
        val category = categories[position]
        val holder: ViewHolder
        val resourceId = context.resources.getIdentifier(category.image,"drawable",
            context.packageName)

        if (convertView == null){
            categoryView =
                LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.ivCategory)
            holder.categoryName = categoryView.findViewById(R.id.tvCategory)
            println("I am born")
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("go Green recycle")
        }

        holder.categoryName?.text = category.title
        holder.categoryImage?.setImageResource(resourceId)
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
    private class ViewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}