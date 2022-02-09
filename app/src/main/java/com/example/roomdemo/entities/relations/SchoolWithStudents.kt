package com.example.roomdemo.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdemo.entities.School
import com.example.roomdemo.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students:List<Student>
)