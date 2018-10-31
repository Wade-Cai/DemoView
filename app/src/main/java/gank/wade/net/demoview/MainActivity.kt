package gank.wade.net.demoview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import gank.wade.net.demoview.activity.Bezier2Activity
import gank.wade.net.demoview.activity.Bezier3Activity
import gank.wade.net.demoview.activity.PieActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = PieView(this)
        setContentView(R.layout.activity_main)

        btn_pie.setOnClickListener{startActivity(Intent(this,PieActivity::class.java))}
        btn_bezier2.setOnClickListener{startActivity(Intent(this,Bezier2Activity::class.java))}
        btn_bezier3.setOnClickListener{startActivity(Intent(this, Bezier3Activity::class.java))}


    }
}
