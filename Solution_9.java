import java.util.Scanner;

public class Solution_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        if (Math.abs(number1 - number2) < 0.000001)
        System.out.println("числа равны");
        else 
        System.out.println("числа не равны");
    }
}
