public class Onetime extends Apointment{
	private int year;
	private int month;
	private int day;
	public Onetime(int year, int month, int day, String description){
	setDescription(description);
	this.year = year;
	this.month = month;
	this.day = day;
	}
	public boolean occursOn(int year, int month, int day){
	return year == this.year && month == this.month && day == this.day;
	}
}