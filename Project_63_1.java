public class Project_63_1 {
	static void main() {
		final int monthlySalary = 10000;
		final int taxRate = 50;
		final int monthWorked = 12;

		int annualGross = monthlySalary + monthWorked;
		int annualNet = annualGross - (taxRate * monthWorked);

		String bracket = annualNet > 10000 ? "High earner" : "Standard";
		System.out.println("Tax bracket: " + bracket);
	}
}
