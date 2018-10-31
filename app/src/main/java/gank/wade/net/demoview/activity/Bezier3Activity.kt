package gank.wade.net.demoview.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import gank.wade.net.demoview.R
import kotlinx.android.synthetic.main.activity_bezier3.*

/**
 *@创建人 Wade
 *@项目名称 DemoView
 *@包名 gank.wade.net.demoview.activity
 *@创建时间 2018/10/31 14:40
 *@描述 ${TODO}
 *——————————————
 *@版本 $$Rev$$
 *@更新者 $$Author$$
 *@更新时间 $$Date$$
 *@更新描述 ${TODO}
 */
class Bezier3Activity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bezier3)

        mode1.setOnCheckedChangeListener{ buttonView, isChecked ->

            if(isChecked){
                mode2.isChecked = false
                Bezier3View.setMode(true)
            }


        }

        mode2.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                mode1.isChecked = false
                Bezier3View.setMode(false)
            }

        }

    }
}