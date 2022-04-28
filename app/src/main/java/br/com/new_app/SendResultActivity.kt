package br.com.new_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SendResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_result)

        val btYes = findViewById<Button>(R.id.yes)
        val btNo = findViewById<Button>(R.id.no)
        
    }
}