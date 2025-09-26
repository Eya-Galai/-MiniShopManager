package com.example.miniaya

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSuivant = findViewById<Button>(R.id.btnSuivant)

        // Affiche un Toast et lance ProfilActivity
        btnSuivant.setOnClickListener {
            Toast.makeText(this, "Bouton cliqué !",
                Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }
}