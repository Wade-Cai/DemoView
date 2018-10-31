package gank.wade.net.demoview.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import gank.wade.net.demoview.PieData
import gank.wade.net.demoview.PieView
import gank.wade.net.demoview.R

/**
 *@创建人 Wade
 *@项目名称 DemoView
 *@包名 gank.wade.net.demoview.activity
 *@创建时间 2018/10/31 14:25
 *@描述 ${TODO}
 *——————————————
 *@版本 $$Rev$$
 *@更新者 $$Author$$
 *@更新时间 $$Date$$
 *@更新描述 ${TODO}
 */
class PieActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie)

        val view = findViewById<PieView>(R.id.pie);

        val datas = ArrayList<PieData>()
        val pieData = PieData("sloop", 60f)
        val pieData2 = PieData("sloop", 30f)
        val pieData3 = PieData("sloop", 40f)
        val pieData4 = PieData("sloop", 20f)
        val pieData5 = PieData("sloop", 20f)
        datas.add(pieData)
        datas.add(pieData2)
        datas.add(pieData3)
        datas.add(pieData4)
        datas.add(pieData5)
        view.setData(datas)

    }

}