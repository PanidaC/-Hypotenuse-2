package th.ac.su.hypotenuse2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lega = findViewById<EditText>(R.id.lega)
        val legb = findViewById<EditText>(R.id.legb)
        val btnsolve = findViewById<Button>(R.id.btnsolve)

        btnsolve.setOnClickListener {
            var a: Double = lega.text.toString().toDouble()
            var doublea: Double = a*1
            var b: Double = legb.text.toString().toDouble()
            var doubleb: Double = b*2

            var c:Double = ((a*a)+(b*b))
            var tri = Math.sqrt(c)

            var intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("a" , doublea.toString())
            intent.putExtra("b" , doubleb.toString())
            intent.putExtra("c" , tri.toString())
            startActivity(intent)
        }

    }
}