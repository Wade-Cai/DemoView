package gank.wade.net.demoview.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import gank.wade.net.demoview.PieView
import gank.wade.net.demoview.R

/**
 *@创建人 Wade
 *@项目名称 DemoView
 *@包名 gank.wade.net.demoview.activity
 *@创建时间 2018/10/31 14:23
 *@描述 ${TODO}
 *——————————————
 *@版本 $$Rev$$
 *@更新者 $$Author$$
 *@更新时间 $$Date$$
 *@更新描述 ${TODO}
 */
class Bezier2Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = PieView(this)
        setContentView(R.layout.activity_bezier2)

    }
}