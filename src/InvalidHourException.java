public class InvalidHourException extends Exception{
	int InvalidHour;
	String validInterval="0 to 23";
	InvalidHourException(int x){
		InvalidHour=x;
	}
	InvalidHourException(int x, String interval){
		InvalidHour=x;
		validInterval=interval;
	}
	public String toString(){
		return ("Values of hour must be within "+validInterval+", thus "+InvalidHour+" is invalid.");
	}
}
