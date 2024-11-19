package com.example.sonora.Models

data class CategoryModel(
    val name : String,
    val coverUrl : String,
) {
    constructor() : this("", "")
}
