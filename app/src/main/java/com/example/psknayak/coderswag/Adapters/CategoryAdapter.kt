package com.example.psknayak.coderswag.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.psknayak.coderswag.Model.Category
import com.example.psknayak.coderswag.R
import com.example.psknayak.coderswag.R.id.categoryImage
import com.example.psknayak.coderswag.R.id.categoryName

class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter(){

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(categoryImage)
            holder.categoryName = categoryView.findViewById(categoryName)

            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
            val category = categories[position]

            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            holder.categoryImage?.setImageResource(resourceId)
            holder.categoryName?.text = category.title
            return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]//To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        return 0//To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
         return categories.count()//To change body of created functions use File | Settings | File Templates.
    }

    private class ViewHolder{
        var categoryImage:ImageView? = null
        var categoryName:TextView? = null
    }
}