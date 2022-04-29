package br.com.new_app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.StringRes

class SendResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_result)

        val btYes = findViewById<Button>(R.id.yes)
        val btNo = findViewById<Button>(R.id.no)
        val btCancel = findViewById<Button>(R.id.cancel)

        btYes.setOnClickListener {
            sendResult(R.string.yes)
        }

        btNo.setOnClickListener {
            sendResult(R.string.no)
        }

        btCancel.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)

            finish()
        }
    }

    private fun sendResult(@StringRes stringResId: Int) {
        val intent = Intent()

        intent.putExtra("Result", getString(stringResId))

        setResult(RESULT_OK, intent)

        finish()
    }
}