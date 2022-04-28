package br.com.new_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<EditText>(R.id.etNome)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btEnviar2 = findViewById<Button>(R.id.btEnviar2)

        btEnviar.setOnClickListener {
            if(etNome.text.isNotBlank()){
                tvResultado.text = getString(R.string.Hello_name, etNome.text.toString())
            } else {
                etNome.error = getString(R.string.type_your_name)
            }

        }
        btEnviar2.setOnClickListener {
            if(etNome.text.isNotBlank()){
                val nomeDigitado = etNome.text.toString()

                val intent = Intent(this, ResultActivity::class.java)

                intent.putExtra("NOME_DIGITADO", nomeDigitado)

                startActivity(intent)
            } else {
                etNome.error = getString(R.string.type_your_name)
            }

        }
    }
}