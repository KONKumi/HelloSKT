package my.edu.tarc.helloskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//INstance Name : Type / Class name
class MainActivity : AppCompatActivity() {
    // onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Load UI to memory
        //R = loaf resource
        setContentView(R.layout.activity_main)

        //Linking UI to program code
        //Declare variable here
        //val = value, var = variable

        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val textViewName: TextView = findViewById(R.id.textView2)
        val buttonShow: Button = findViewById(R.id.buttonShow)
        val buttonHide: Button = findViewById(R.id.buttonHIde)

        buttonShow.setOnClickListener{
            imageViewQR.visibility = View.VISIBLE
            textViewName.visibility=View.VISIBLE
        }

        buttonHide.setOnClickListener{
            imageViewQR.visibility = View.INVISIBLE
            textViewName.visibility=View.INVISIBLE
        }
    }
}