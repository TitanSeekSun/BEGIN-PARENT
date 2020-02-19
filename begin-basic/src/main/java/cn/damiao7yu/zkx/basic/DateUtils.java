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
	 * 鑾峰彇褰撳墠灏忔椂鐨勫垵濮嬫椂闂�
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
	 * 鑾峰彇褰撳墠鏃堕棿鍓峢ours涓皬鏃剁殑   璧峰  鏃堕棿
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
	 * 鑾峰彇褰撳墠鏃堕棿鍓峢ours涓皬鏃剁殑     缁撴潫   鏃堕棿  ,璺濈鏂颁竴灏忔椂 宸�1姣
	 * 浼�1  灏辨槸涓婁竴涓皬鏃�  
	 * 浼�2  灏辨槸涓婁袱涓皬鏃�
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
