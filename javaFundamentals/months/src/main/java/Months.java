import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//
//        int numb = checkNumber(scan);
//        months(numb);

        System.out.println("Enter number of month (from 1 to 12):");
        int number = scan.nextInt();
        while(number < 1 || number > 12 ) {
            System.out.println("Number of month incorrect. Please try again");
            number = scan.nextInt();
        }
        months(number);
    }

    static void months(int numb) {
        String[] month = new String[12];
        month[0] = "january";
        month[1] = "february";
        month[2] = "march";
        month[3] = "april";
        month[4] = "may";
        month[5] = "june";
        month[6] = "july";
        month[7] = "august";
        month[8] = "september";
        month[9] = "october";
        month[10] = "november";
        month[11] = "december";
        System.out.println(month[numb - 1]);
    }

    static int checkNumber(Scanner scan) {
        System.out.println("Enter number of month (from 1 to 12):");
        int numb = scan.nextInt();

        if (numb < 1 || numb > 12) {
            System.out.println("Number of month incorrect.");
            numb = checkNumber(scan);
        }
        return numb;
    }

}
