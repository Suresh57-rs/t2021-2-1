import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        int a, count = 0;
        Scanner input = new Scanner(System.in);
        //input 'a' value.
        System.out.println("Enter 'a' value ");
        a = input.nextInt();
        System.out.println("input : " + a);
        //for loop for finding odd numbers.
        for (int i = 1; i < 100; i++) {
            //if input 'a' value is odd number then we have to print series of odd numbers till 'a'.
            if (a % 2 != 0) {
                count++;
                //printing "output" String once and one odd number.
                if (count == 1) {
                    System.out.print("output : ");
                    System.out.print(i);
                }
                //printing from 2nd odd number with comma (,).
                if (count >= 2) {
                    System.out.print(", " + i);
                }
                //when input 'a' value is even number then we to print 'a-1' odd numbers
            } else if (a % 2 == 0) {
                a -= 1;
                count++;
                if (count == 1) {
                    System.out.print("output : ");
                    System.out.print(i);
                }
                if (count >= 2) {
                    System.out.print(", " + i);
                }
            }
            //break loop if count == a.
            if (count == a) {
                break;
            }

        }

    }
}
