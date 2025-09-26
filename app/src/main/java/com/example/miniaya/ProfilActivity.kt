package com.example.miniaya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        val btnRetour = findViewById<Button>(R.id.btnRetour)

        // Affiche un Toast et lance MainActivity
        btnRetour.setOnClickListener {
            Toast.makeText(this, "Bouton cliqué !",
                Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}