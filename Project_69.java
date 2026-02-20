public class Project_69 {
	static void main() {
		String day = "Monday";
		switch (day.toLowerCase()) {
		case "monday":
			System.out.println("Start of the work week");
			break;
		case "friday":
			System.out.println("End of the work week");
			break;
		default:
			System.out.println("Midweek days");
		}
	}
}
