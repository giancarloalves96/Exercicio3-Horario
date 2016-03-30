public class Time{
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
	
	public void setHour(int hour) throws InvalidHourException{
		if(hour>=0 && hour<24)
			this.hour=hour;
		else throw new InvalidHourException(hour, "0 to 23");
	}
	
	public void setMinute(int minute) throws InvalidMinuteException{
		if(minute>=0 && minute<60)
			this.minute=minute;
		else throw new InvalidMinuteException(minute, "0 to 59");
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
		try{
			t.setHour(23);	
		}
		catch(InvalidHourException ex){
			System.out.println(ex.toString());
			return;
		}
		try{
			t.setMinute(59);	
		}
		catch(InvalidMinuteException ex){
			System.out.println(ex.toString());
			return;
		}
		System.out.println("The time now is "+t.getTime());
	}
}
