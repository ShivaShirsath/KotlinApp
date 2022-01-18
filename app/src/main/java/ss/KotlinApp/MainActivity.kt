package ss.KotlinApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main.text = "Shiva is Here 🤘\nYou Must Remember, Who am I. 😁"
        main.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW
                ).apply {
                    data = Uri.parse(
                        "https://github.com/ShivaShirsath"
                    )
                }
            )
        }
    }
}
