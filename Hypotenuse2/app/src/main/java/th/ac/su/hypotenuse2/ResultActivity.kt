package th.ac.su.hypotenuse2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var valuea = findViewById<TextView>(R.id.tvA)
        var valueb = findViewById<TextView>(R.id.tvB)
        val valuec = findViewById<TextView>(R.id.tvC)

        val a = intent.getStringExtra("a")
        valuea.setText(a)
        val b = intent.getStringExtra("b")
        valueb.setText(b)
        val c = intent.getStringExtra("c")
        valuec.setText(c)

       val btnok = findViewById<Button>(R.id.btnok)
        btnok.setOnClickListener {
            var intent = Intent()
            setResult(Activity.RESULT_OK,intent)
            finish()
        }

    }
}