package com.example.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomdemo.database.SchoolDatabase
import com.example.roomdemo.entities.Director
import com.example.roomdemo.entities.School
import com.example.roomdemo.entities.Student
import com.example.roomdemo.entities.Subject
import com.example.roomdemo.entities.relations.StudentSubjectCrossRef

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dao = SchoolDatabase.getInstance(this).schoolDao

        val directors = listOf(
            Director("Done","MIT School"),
            Director("Dtwo ","Kotlin School"),
            Director("Dthree ","Android School"),
        )

        val schools = listOf(
            School("Wharton School"),
            School("Kotlin School"),
            School("JetBrains School")
        )
        val subjects = listOf(
            Subject("Dating for programmers"),
            Subject("Avoiding depression"),
            Subject("Bug Fix Meditation"),
            Subject("Logcat for Newbies"),
            Subject("How to use Google")
        )

        val students = listOf(
            Student("Berlin Jezos", 2, "Kotlin School"),
            Student("Mark carry", 5, "Jake Wharton School"),
            Student("Jeff Wolf", 8, "Kotlin School"),
            Student("Donny Jepp", 1, "Kotlin School"),
            Student("Justin Biber", 2, "JetBrains School")
        )
        val studentSubjectRelations = listOf(
            StudentSubjectCrossRef("First Person", "aaaaaaaaaaaa aaaaaaaaaaaa aaaaaaaaaa"),
            StudentSubjectCrossRef("First Person", "bbbbbbb bbbbbbbbb bbbbbbbbb"),
            StudentSubjectCrossRef("Second Person", "cccccc cccccccccc ccccccc"),
            StudentSubjectCrossRef("Second Person", "dddddddd dddddd dddddddddd"),
            StudentSubjectCrossRef("Third Person", "eeee eeeeeeee eeeeeeee"),
            StudentSubjectCrossRef("Fourth Person", "fffffff fffffffff ffffffffff"),
            StudentSubjectCrossRef("Fifth Person", "ggggggg gggggg"),
            StudentSubjectCrossRef("Sixth Person", "zzzzzzzzzz zzzzzzzzzz"),
            StudentSubjectCrossRef("Sixth Person", "xxxxx xxxxxxx xxxxxxxxxxx")
        )
    }
}