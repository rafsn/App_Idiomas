package br.projeto.app_idiomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private var textFlag = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener{
            when (textFlag) {
                0 -> textView.text = "Test sent"
                1 -> textView.text = "Prova inviata"
                2 -> textView.text = "Test geschickt"
            }
            textFlag = (textFlag + 1 ) % 4
        }

    }
}