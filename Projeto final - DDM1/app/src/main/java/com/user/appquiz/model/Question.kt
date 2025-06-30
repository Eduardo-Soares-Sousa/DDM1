package com.user.appquiz.model

import androidx.annotation.DrawableRes

data class Question (
    val text: String,
    val options: List<String>,
    val answer: Int,
    @DrawableRes val photo: Int ?= null
)