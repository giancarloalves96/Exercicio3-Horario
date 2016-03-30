public class Time {
	int hour;
	int minute;
	
	Time(){
		hour=0;
		minute=0;
	}
	
	public int getHour(){
		return this.hour;
	}
	
	public int getMinute(){
		return this.minute;
	}
	
	public void setHour(int hour){
		this.hour=hour;
	}
	
	public void setMinute(int minute){
		this.minute=minute;
	}
	
	String getTime(){
		int hour = getHour();
		int minute = getMinute();
		String time = "";
		time+=hour;
		time+=":";
		time+=minute;
		return time;
	}
	
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(3);
		t.setMinute(25);
		System.out.println("The time now is "+t.getTime());
	}
}
