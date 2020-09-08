package com.example.mediabandtec

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(componente:View) {
        val nomeAluno = input_name.text
        val continuada1 = nota1.text.toString().toInt()
        val continuada2 = nota2.text.toString().toInt()
        val continuada3 = nota3.text.toString().toInt()
        val resultadoFinal = (continuada1 + continuada2 + continuada3) / 3

        if (continuada1 > 10 || continuada2 > 10 || continuada3 > 10){
            resultado.visibility = View.VISIBLE
            resultado.setTextColor(Color.RED)
            resultado.text = "Verifique se todos os campos de nota estão entre 0 e 10"
        }

        else if (resultadoFinal < 5){
            resultado.visibility = View.VISIBLE
            resultado.setTextColor(Color.RED)
            resultado.text = "Vish ${ nomeAluno} sua média foi a baixo da média: ${resultadoFinal}"

        }
        else if (resultadoFinal < 8) {
            resultado.visibility = View.VISIBLE
            resultado.setTextColor(Color.BLUE)
            resultado.text = "Parabéns ${ nomeAluno } você está na média: ${resultadoFinal}"
        }

        else if (resultadoFinal <= 10 ) {
            resultado.visibility = View.VISIBLE
            resultado.setTextColor(Color.GREEN)
            resultado.text = "Ui papai, parabéns ${ nomeAluno } você está na média: ${resultadoFinal}"
        }

        else {
            resultado.visibility = View.VISIBLE
            resultado.setTextColor(Color.BLACK)
            resultado.text = "Vishi ${ nomeAluno }, parece que colocou alguma nota errada, verifique!"
        }


    }
}