package com.fluidmatterdevelopment.coderswag.services

import com.fluidmatterdevelopment.coderswag.model.Category
import com.fluidmatterdevelopment.coderswag.model.Products

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Products("Devslopes Graphic Beanie","$18", "hat01"),
        Products("Devslopes Hat Black","$20", "hat02"),
        Products("Devslopes Hat White","$18", "hat03"),
        Products("Devslopes Hat Snapback","$22", "hat04")
    )

    val hoodies = listOf(
        Products("Devslopes Hoodie Gray","$28","hoodie01"),
        Products("Devslopes Hoodie Red","$32","hoodie02"),
        Products("Devslopes Gray Hoodie","$28","hoodie03"),
        Products("Devslopes Black Hoodie","$28","hoodie04")
    )
    val shirts = listOf(
        Products("Devslopes Shirt Black","$18","shirt01"),
        Products("Devslopes Badge Light Gray","$22","shirt02"),
        Products("Devslopes Logo Shirt Red","$22","shirt03"),
        Products("Devslopes Hustle","$25","shirt04"),
        Products("Kickflip Studios","$18","shirt05")
    )
}