/*
    Программа которая рисует треугольник. В первой строке 10 звездочек, во второй 9 и тд.
 */
public class Solution_42 {
    static void main() {
        for (int i = 0; i < 10; i++) {
            int startCount = 10 - i;
            for (int j= 0; j < startCount; j++)
                System.out.print("*");
                System.out.println();
        }

    }
}
