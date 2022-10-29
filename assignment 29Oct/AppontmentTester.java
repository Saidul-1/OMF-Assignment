public class ApointmentTester{
	public static void main(String[] args){
		System.out.print("Monthly is subclass of Appointment: ");
		System.out.println(Monthly.class.getSuperclass() == Appointment.class);
		System.out.println("Expected: true");
		System.out.print("Onetime is subclass of Appointment: ");
		System.out.println(Onetime.class.getSuperclass() == Appointment.class);
		System.out.println("Expected: true");
		System.out.print("Daily is subclass of Appointment: ");
		System.out.println(Daily.class.getSuperclass() == Appointment.class);
		System.out.println("Expected: true");
		System.out.print("Monthly appointments have no extra fields: ");
		System.out.println(Monthly.class.getDeclaredFields().length == 1);
		System.out.println("Expected: true");
		System.out.print("Onetime appointments have no extra fields: ");
		System.out.println(Onetime.class.getDeclaredFields().length == 3);
		System.out.println(Onetime.class.getDeclaredFields().length == 3);
		System.out.println("Expected: true");
		System.out.print("Daily appointments have no extra fields: ");
		System.out.println(Daily.class.getDeclareFields().length == 0);
		System.out.println("Expected: true");
		Appointment obj = new Monthly(15, "pay the bills");
		System.out.println("Checking Monthly appointment: "+ obj);
		System.out.println("Expected: pay the bills");
		System.out.println(obj.occursOn(2016, 8, 15));
		System.out.println("Expected: true");
		obj = new Onetime(2016, 11, 1, "Dentist appointment.");
		System.out.println("Checking onetime appointment: " + obj);
		System.out.println("Expected: Dentist appointment.");
		System.out.println(obj.occursOn(2016, 11, 1));
		System.out.println("Expected: true");
		obj = new Daily("walk the dog.");
		System.out.println("Checking daily appointment: " + obj);
		System.out.println("Expected: walk the dog");
		System.out.println(obj.occursOn(2016, 12, 25));
		System.out.println("Expected: true");
	}
}