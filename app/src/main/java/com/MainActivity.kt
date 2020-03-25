package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            openProfile()
        }
    }

    fun openProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra(
            "img",
            "https://ep01.epimg.net/deportes/imagenes/2019/07/07/actualidad/1562503713" +
                    "_795898_1562527576_noticia_normal.jpg"
        )
        intent.putExtra("name", "Marc Marquez");
        intent.putExtra("birthday", "02/3/1993");
        intent.putExtra("city", "Cervera (Spain)");
        intent.putExtra(
            "desc",
            "Marc Márquez Alentà (Cervera, Lérida, 17 de febrero de 1993) es un piloto de " +
                    "motociclismo español que, actualmente, corre en MotoGP .1​ Ha ganado ocho " +
                    "títulos del Campeonato del Mundo de Motociclismo en tres categorías " +
                    "diferentes:125 cc (2010), Moto2 (2012) y seis veces en MotoGP (2013, 2014, " +
                    "2016, 2017, 2018 y 2019).2​ Actualmente es piloto del equipo Repsol Honda, 3​ " +
                    "donde ha acumulado 50 victorias y 78 podios en 105 carreras disputadas. En " +
                    "febrero de 2020 extendió su contrato con Honda hasta 2024."
        );
        startActivity(intent)
    }
}