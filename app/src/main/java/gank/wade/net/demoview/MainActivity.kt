package gank.wade.net.demoview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = PieView(this)
        setContentView(R.layout.activity_main)

//        val datas = ArrayList<PieData>()
//        val pieData = PieData("sloop", 60f)
//        val pieData2 = PieData("sloop", 30f)
//        val pieData3 = PieData("sloop", 40f)
//        val pieData4 = PieData("sloop", 20f)
//        val pieData5 = PieData("sloop", 20f)
//        datas.add(pieData)
//        datas.add(pieData2)
//        datas.add(pieData3)
//        datas.add(pieData4)
//        datas.add(pieData5)
//        view.setData(datas)

    }
}
