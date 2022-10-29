public abstract class Appointment
{
	private String description;
	public Appontment()
	{
	description="";
	}
	public void setDescription(String description){
		this.description=description;
	}
	public abstract boolean occursOn(int year, int month, int day);
	public String toString(){
	return description;
	}
}