package gank.wade.net.demoview

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View





/**
 *@创建人 Wade
 *@项目名称 DemoView
 *@包名 gank.wade.net.demoview
 *@创建时间 2018/10/31 14:07
 *@描述 ${TODO}
 *——————————————
 *@版本 $$Rev$$
 *@更新者 $$Author$$
 *@更新时间 $$Date$$
 *@更新描述 ${TODO}
 */
class BezierView : View {

    constructor(mContext: Context) : super(mContext, null)

    constructor(mContext: Context, attrs: AttributeSet) : super(mContext, attrs, 0)

    // 画笔
    private var mPaint = Paint()

    private lateinit var start:PointF
    private lateinit var end:PointF
    private lateinit var control:PointF


    private var centerX:Int =0
    private var centerY:Int = 0


    init {
        mPaint.color = Color.BLACK
        mPaint.strokeWidth = 8f
        mPaint.style = Paint.Style.STROKE
        mPaint.textSize = 60f

        start = PointF(0f,0f);
        end = PointF(0f,0f);
        control = PointF(0f,0f);
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        centerX = w/2
        centerY = w/2

        start.x = (centerX-200).toFloat();
        start.y = centerY.toFloat();
        end.x = (centerX+200).toFloat();
        end.y = centerY.toFloat();
        control.x = centerX.toFloat();
        control.y = (centerY-100).toFloat();

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        // 根据触摸位置更新控制点，并提示重绘
        control.x = event.x
        control.y = event.y
        invalidate()
        return true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 绘制数据点和控制点
        mPaint.setColor(Color.GRAY);
        mPaint.setStrokeWidth(20f);
        canvas.drawPoint(start.x,start.y,mPaint);
        canvas.drawPoint(end.x,end.y,mPaint);
        canvas.drawPoint(control.x,control.y,mPaint);

        // 绘制辅助线
        mPaint.setStrokeWidth(4f);
        canvas.drawLine(start.x,start.y,control.x,control.y,mPaint);
        canvas.drawLine(end.x,end.y,control.x,control.y,mPaint);

        // 绘制贝塞尔曲线
        mPaint.color = Color.RED
        mPaint.setStrokeWidth(8f)

        val path = Path()

        path.moveTo(start.x, start.y)
        path.quadTo(control.x, control.y, end.x, end.y)

        canvas.drawPath(path, mPaint)
    }





}