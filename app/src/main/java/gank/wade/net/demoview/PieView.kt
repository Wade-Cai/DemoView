package gank.wade.net.demoview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.util.Log
import android.view.View

/**
 *@创建人 Wade
 *@项目名称 DemoView
 *@包名 gank.wade.net.demoview
 *@创建时间 2018/10/26 16:47
 *@描述 ${TODO}
 *——————————————
 *@版本 $$Rev$$
 *@更新者 $$Author$$
 *@更新时间 $$Date$$
 *@更新描述 ${TODO}
 */
class PieView : View {

    private val mColors = intArrayOf(-0x330100, -0x9b6a13, -0x1cd9ca, -0x800000, -0x7f8000, -0x7397, -0x7f7f80, -0x194800, -0x830400)

    // 饼状图初始绘制角度
    private var mStartAngle = 0f
    // 数据
    private var mData: ArrayList<PieData>? = null
    // 宽高
    private var mWidth: Int = 0
    private var mHeight: Int = 0
    // 画笔
    private var mPaint = Paint()

    constructor(mContext: Context) : super(mContext, null)

    constructor(mContext: Context, attrs: AttributeSet) : super(mContext, attrs, 0)

    init {
        mPaint.style = Paint.Style.FILL
        mPaint.isAntiAlias = true
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        mWidth = w
        mHeight = h
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (null == mData)
            return;

        var currentStartAngle = mStartAngle// 当前起始角度
        canvas.translate(mWidth.toFloat() / 2, mHeight.toFloat() / 2);                // 将画布坐标原点移动到中心位置
        val r = (Math.min(mWidth, mHeight) / 2 * 0.8).toFloat()// 饼状图半径
        val rect = RectF(-r, -r, r, r);

        for ((index, pie) in mData!!.withIndex()) {
            mPaint.color = pie.color
            canvas.drawArc(rect, currentStartAngle, pie.angle, true, mPaint)
            currentStartAngle += pie.angle

        }
    }


    // 设置起始角度
    fun setStartAngle(mStartAngle: Float) {
        this.mStartAngle = mStartAngle
        invalidate()   // 刷新
    }

    // 设置数据
    fun setData(mData: ArrayList<PieData>) {
        this.mData = mData
        initData(mData)
        invalidate()   // 刷新
    }

    // 初始化数据
    fun initData(mData: ArrayList<PieData>) {

        if (mData.size == 0) {
            return
        }

        var sumValue = 0f

        for ((index, pie) in mData.withIndex()) {

            sumValue += pie.value //计算数值和

            val j = index % mColors.size

            pie.color = mColors[j];//设置颜色

        }

        for ((index, pie) in mData.withIndex()) {

            val percentage = pie.value / sumValue// 百分比

            val angle = percentage * 360 // 对应的角度

            pie.percentage = percentage;
            pie.angle = angle

            Log.i("mData", "percentage: $percentage   angle:$angle")
        }

    }

}