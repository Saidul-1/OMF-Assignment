public class Monthly extends Appointment{
	private int day;
	public Monthly(int day, String description){
	setDescription(description);
	this.day=day;
	}
	public boolean occursOn(int year, int month, int day){
	return day == this.day;
	}
}