import java.util.Scanner;

public class Solution_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 5) {
            System.out.println("число меньше 5");
        } else if (number > 5) {
            System.out.println("число больше 5");
        } else if (number == 5){
            System.out.println("число равно 5");
        }
        
        //String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
        //System.out.println(result);
    }
}
