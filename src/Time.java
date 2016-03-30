public class Time {
	int hour;
	int minute;
	
	Time(){}
	
	public static void main(String[] args) {
		Time t = new Time();
		t.hour=3;
		t.minute=25;
		System.out.println("The time now is "+t.hour+":"+t.minute);
	}
}
