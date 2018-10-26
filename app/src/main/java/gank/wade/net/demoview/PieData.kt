package gank.wade.net.demoview

/**
 *@创建人 Wade
 *@项目名称 DemoView
 *@包名 gank.wade.net.demoview
 *@创建时间 2018/10/26 16:39
 *@描述 ${TODO}
 *——————————————
 *@版本 $$Rev$$
 *@更新者 $$Author$$
 *@更新时间 $$Date$$
 *@更新描述 ${TODO}
 */
data class PieData(var name: String="",
                   var value: Float=0f,
                   var percentage: Float = 0f,
                   var color: Int = 0,
                   var angle: Float = 0f)