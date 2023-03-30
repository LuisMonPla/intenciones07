package com.example.intenciones07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)
        lateinit var numeros: TextView
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btnBor: Button = findViewById(R.id.btnBor)
        val btnEli: Button = findViewById(R.id.btnEli)
        numeros = findViewById(R.id.txtvista)

        btn1.setOnClickListener{
            numeros.text = numeros.text.toString() + "1"
        }
        btn2.setOnClickListener{
            numeros.text = numeros.text.toString() + "2"
        }
        btn3.setOnClickListener{
            numeros.text = numeros.text.toString() + "3"
        }
        btn4.setOnClickListener{
            numeros.text = numeros.text.toString() + "4"
        }
        btnBor.setOnClickListener{
            val filaactual = numeros.text.toString()
            if(filaactual.isNotEmpty()){
                numeros.text = filaactual.substring(0, filaactual.length - 1)
            }
        }
        btnEli.setOnClickListener{
            numeros.text = ""
        }
    }
}