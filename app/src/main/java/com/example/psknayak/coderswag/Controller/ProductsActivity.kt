package com.example.psknayak.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.psknayak.coderswag.R
import com.example.psknayak.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoyType = intent.getStringExtra(EXTRA_CATEGORY)
        
    }
}
