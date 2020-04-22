import java.util.Scanner;

public class RandomNumbers {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int size = in.nextInt();
        System.out.println("Choose format output of numbers : \n 1)newline \n 2)without newline");
        int format = in.nextInt();
        Object [] numbers = new Object[size];
        for (int i=0;i<numbers.length;i++) {
            numbers[i] = (int) ( Math.random() * size);}
        if (format == 1) {
       for (int i=0; i<numbers.length; i++) {
           System.out.println(numbers[i]); }
        }
        else
            for (int i=0; i<numbers.length; i++) {
                System.out.print(numbers[i]); }

    }
}
