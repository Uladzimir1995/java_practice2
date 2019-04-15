import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the array size");
        Integer size = scan.nextInt();
        System.out.println("The array size is: " + size);

        Integer[] array = new Integer[size];
        System.out.println("Input array size amount of numbers");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        Integer sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);


    }
}