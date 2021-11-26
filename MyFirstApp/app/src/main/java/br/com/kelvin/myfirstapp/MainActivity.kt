package br.com.kelvin.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val = Declarar constantes
//        ver = Declarar variáveis
        val btnClickHere = findViewById<Button>(R.id.btnClickHere)
        val tvMain = findViewById<TextView>(R.id.txtMain)
        var counter = 0

        btnClickHere.setOnClickListener {
            tvMain.text = counter++.toString()
            Toast.makeText(this, "Eu não sei o que colocar aqui bicho! Oloko!", Toast.LENGTH_LONG).show()
        }
    }
}