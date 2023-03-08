package com.indrapush.programmingmcq.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Question(
    @PrimaryKey
    val id : String,
    val question : String,
    val option1 : String,
    val option2 : String,
    val option3 : String,
    val option4 : String,
    val correctAns : Int,
    val subject : String,
    val topic : String

)
