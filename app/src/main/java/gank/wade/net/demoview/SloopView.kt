package gank.wade.net.demoview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 *@创建人 Wade
 *@项目名称 DemoView
 *@包名 gank.wade.net.demoview
 *@创建时间 2018/10/26 14:36
 *@描述 ${TODO}
 *——————————————
 *@版本 $$Rev$$
 *@更新者 $$Author$$
 *@更新时间 $$Date$$
 *@更新描述 ${TODO}
 */
class SloopView : View {

    private val mContext: Context = context

    val mPaint: Paint = Paint()

    init {
        mPaint.color = Color.BLACK
        mPaint.style = Paint.Style.FILL
        mPaint.strokeWidth = 10f
    }

    constructor(mContext: Context) : super(mContext,null)

    constructor(mContext: Context, attrs: AttributeSet) : super(mContext, attrs,0)

    constructor(mContext: Context, attrs: AttributeSet,defStyleAttr:Int) : super(mContext, attrs,defStyleAttr) {
    }

    fun drawLine(canvas: Canvas){

      canvas.drawPoint(200f,200f,mPaint)
      canvas.drawPoints(floatArrayOf(500f,500f,500f,600f,500f,700f),mPaint)


    }



    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        drawLine(canvas)

    }
}