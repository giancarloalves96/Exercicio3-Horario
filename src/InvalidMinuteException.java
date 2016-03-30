public class InvalidMinuteException extends Exception{
	int InvalidMinute;
	String validInterval="0 to 59";
	InvalidMinuteException(int x){
		InvalidMinute=x;
	}
	InvalidMinuteException(int x, String interval){
		InvalidMinute=x;
		validInterval=interval;
	}
	public String toString(){
		return ("Values of hour must be within "+validInterval+", thus "+InvalidMinute+" is invalid.");
	}
}
