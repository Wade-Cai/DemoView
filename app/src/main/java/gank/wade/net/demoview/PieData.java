package gank.wade.net.demoview;

import android.support.annotation.NonNull;

/**
 * @创建人 Wade
 * @项目名称 DemoView
 * @包名 gank.wade.net.demoview
 * @创建时间 2018/10/26 16:12
 * @描述 ${TODO}
 * ——————————————
 * @版本 $$Rev$$
 * @更新者 $$Author$$
 * @更新时间 $$Date$$
 * @更新描述 ${TODO}
 */
public class PieData {
	// 用户关心数据
	private String name;        // 名字
	private float value;        // 数值
	private float percentage;   // 百分比
	
	// 非用户关心数据
	private int color = 0;      // 颜色
	private float angle = 0;    // 角度
	
	public PieData(@NonNull String name, @NonNull float value) {
		this.name = name;
		this.value = value;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getValue() {
		return value;
	}
	
	public void setValue(float value) {
		this.value = value;
	}
	
	public float getPercentage() {
		return percentage;
	}
	
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public float getAngle() {
		return angle;
	}
	
	public void setAngle(float angle) {
		this.angle = angle;
	}
	
}


