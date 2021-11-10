package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList =  listOf<Superhero>(
            Superhero(
                R.drawable.supratman,
                "superman",
                "axcbuahbcucass"
            ),

            Superhero(
                R.drawable.antman,
                "antman",
                "axcbuahbcucass"
            ),

            Superhero(
                R.drawable.ironman,
                "Ironman",
                "axcbuahbcucass"
            ),

            Superhero(
                R.drawable.batman,
                "batman",
                "axcbuahbcucass"
            ),



        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superheroList){
            
        }
    }
}