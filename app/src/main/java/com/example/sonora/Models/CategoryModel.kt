package com.example.sonora.Models

import android.hardware.biometrics.BiometricManager.Strings

data class CategoryModel(
    val name : String,
    val coverUrl : String,
    val songs : List<String>
) {
    constructor() : this("", "", listOf())
}
