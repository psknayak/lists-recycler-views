package com.example.psknayak.coderswag.Services

import com.example.psknayak.coderswag.Model.Category
import com.example.psknayak.coderswag.Model.Product

object DataService {

    val categories = listOf(Category("SHIRT","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL GOODS","digitalgoodsimage"))

    val hats = listOf(Product("Graphic Beanie", "$20","hat01"),
                      Product("Hat Black", "$25","hat02"),
                      Product("Hat White", "$22","hat03"),
                      Product("Hat Snapback", "$30","hat04"))

    val hoodies = listOf(Product("Hoodie White", "$40", "hoodie01"),
                         Product("Hoodie Red", "$45", "hoodie02"),
                         Product("Hoodie Grey", "$42", "hoodie03"),
                         Product("Hoodie Black", "$50", "hoodie04"))

    val shirts = listOf(Product("Shirt Black", "$35", "shirt01"),
            Product("Shirt Badge Light Grey", "$38", "shirt02"),
            Product("Shirt Red", "$31", "shirt03"),
            Product("Shirt Hustle", "$39", "shirt04"),
            Product("Kickflip Studios","$45","shirt05"))
}