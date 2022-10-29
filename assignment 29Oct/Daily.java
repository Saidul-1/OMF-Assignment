public class Daily extends Apointment{
	public Daily(String description){
	setDescription(description);
	}
	public boolean occursOn(int year, int month, int day){
		return true;
	}
}