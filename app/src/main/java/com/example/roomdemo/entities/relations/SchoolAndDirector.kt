package com.example.roomdemo.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdemo.entities.Director
import com.example.roomdemo.entities.School

data class SchoolAndDirector(
    @Embedded val school:School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director:Director
)
