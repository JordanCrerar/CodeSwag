package com.fluidmatterdevelopment.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fluidmatterdevelopment.coderswag.R
import com.fluidmatterdevelopment.coderswag.model.Product

class ProductsAdaptor(private val context: Context, private val products: List<Product>) : RecyclerView.Adapter<ProductsAdaptor.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.products_list_item,parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImage = itemView.findViewById<ImageView>(R.id.ivProducts)
        private val productName = itemView.findViewById<TextView>(R.id.tvProductsTitle)
        private val productPrice = itemView.findViewById<TextView>(R.id.tvProductPrice)

        fun bindProduct(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image,"drawable",
                context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.Price
        }
    }
}