package cn.damiao7yu.zkx.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private final SimpleDateFormat longHourSdf;
	
	private static long hourLong = 60*60*1000;
	
	private static long dayLong  = 24 * hourLong;
	
	private static long weekLong = 7 * dayLong;
	
	
	public DateUtils(){
	this.longHourSdf = new SimpleDateFormat("yyyy-MM-dd HH");
	}
	
	
	/**
	 * 获取当前所在时间的起始时间
	 * @return
	 */
	public Date getCurrentHourStartTime() {
		Date now = new Date();
		try {
		now = longHourSdf.parse(longHourSdf.format(now));
		} catch (Exception e) {
		e.printStackTrace();
		}
		return now;
	}
	
	public long getCurrentHourStartTimeLong() {
		Date now = new Date();
		try {
		now = longHourSdf.parse(longHourSdf.format(now));
		} catch (Exception e) {
		e.printStackTrace();
		}
		return now.getTime();
	}
	
	/**
	 * 获取上一个小时的起始时间
	 * @param hours
	 * @return
	 */
	public long getBeforeHourStartTimeLong(int hours) {
		Date now = new Date();
		try {
		now = longHourSdf.parse(longHourSdf.format(now));
		} catch (Exception e) {
		e.printStackTrace();
		}
		long beforeHourStartTime =now.getTime()- hours * hourLong;
		return beforeHourStartTime;
	}
	/**
	 * 获取上一个小时的结束时间
	 * @param hours
	 * @return
	 */
	public long getBeforeHourEndTimeLong(int hours) {
		
		Date now = new Date();
		try {
		now = longHourSdf.parse(longHourSdf.format(now));
		} catch (Exception e) {
		e.printStackTrace();
		}
		long beforeHourStartTime =now.getTime()- (hours-1)*hourLong -1;
		return beforeHourStartTime;
	}

}
