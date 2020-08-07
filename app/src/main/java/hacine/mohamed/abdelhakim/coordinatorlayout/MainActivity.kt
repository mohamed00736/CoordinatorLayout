package hacine.mohamed.abdelhakim.coordinatorlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




//        btnScrollBased.setOnClickListener(
//                startActivity(Intent(this , ScrollBasedActivtiy::class.java))
//        )
    }

    fun gotoscroll(view: View) {

        startActivity(Intent(this , ScrollBasedActivtiy::class.java))
    }
}

