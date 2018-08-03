package com.example.psknayak.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.psknayak.coderswag.Adapters.CategoryAdapter
import com.example.psknayak.coderswag.Model.Category
import com.example.psknayak.coderswag.R
import com.example.psknayak.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter:CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this,"You chose ${category.title}",Toast.LENGTH_SHORT).show()
        }
    }
}
