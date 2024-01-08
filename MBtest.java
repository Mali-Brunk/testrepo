// Mali Brunk
// CS 145
// Takes 3 integers and determines smallest value and average
// I was using the wrong email oops

import java.util.Scanner;

public class MBtest {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner input = new Scanner(System.in);

        do {
            int[] values = new int[3];
            
            inputValues(values);
            int smallest = smallestValue(values[0], values[1], values[2]);
            double average = aveValue(values);
            System.out.printf("%nThe smallest value is %d%nThe average is %.1f%n%n", smallest, average);

            System.out.println("Would you like to run the program again? Type YES or NO");
            String yesOrNo = input.nextLine();
            quit = toQuitOrNotToQuit(yesOrNo);

        } while (quit != true);
    }

    public static boolean toQuitOrNotToQuit(String s) {
        if ((s.startsWith("Y")) || (s.startsWith("y"))) {
            return false;
        } else {
            return true;
        }
    }

    public static void inputValues(int[] values) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter an integer: ");
            values[i] = input.nextInt();
        }
    }
    public static int smallestValue(int x, int y, int z) {
        int smallest;

        if ((x <= y) && (x <= z)) {
            smallest = x;
        } else if ((y <= x) && (y <= z)) {
            smallest = y;
        } else {
            smallest = z;
        }
        return smallest;
    }

    public static double aveValue(int[] values) {
        int count = 0;
        int sum = 0;

        while (count < 3) {
            sum += values[count];
            count++;
        }

        double average = (sum / 3);
        return average;
    }   
}
