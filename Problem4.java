import java.util.Scanner;

public class Problem4 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter array size : ");
        //input array size
        int[] array = new int[input.nextInt()];
        //calling method find multiple count
        findMultiplesCount(array);
    }

    public static void findMultiplesCount(int[] array) {
        int count = 0;
        System.out.print("Enter array values : ");
        //taking array values from user
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = input.nextInt();
        }
        //finding multiples count
        for (int i = 1; i <= 9; i++) {
            //after every iteration making count=0 to update new value
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] % i == 0) {
                    count++;
                }
            }
            if (i == 1) {
                System.out.print("{ ");
            }
            //printing multiples count from 1 to 9
            System.out.print(+i + " : " + count + ", ");
        }
        System.out.print("} ");
    }
}
