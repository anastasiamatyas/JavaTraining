import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class OptionalTaskJavaFundamental {
    static List<String> listOfNumbers;

    public static List <String> createListOfNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scan.nextInt();
        System.out.println("Введите числа:");
        listOfNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listOfNumbers.add(scan.next());
        }
        return listOfNumbers;
    }

    public static void chooseMaxAndMinLength() {
        String maxNumber = null;
        int maxSize = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (maxSize < listOfNumbers.get(i).length()) {
                maxSize = listOfNumbers.get(i).length();
                maxNumber = listOfNumbers.get(i);
            }
        }
        String minNumber = listOfNumbers.get(0);
        int minSize = listOfNumbers.get(0).length();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (minSize > listOfNumbers.get(i).length()) {
                minSize = listOfNumbers.get(i).length();
                minNumber = listOfNumbers.get(i);
            }
        }
        System.out.println("Number with max length is " + maxNumber + ": length is " + maxSize);
        System.out.println("Number with min length is " + minNumber + ": length is " + minSize);
    }
    public static class CompareTo implements Comparator<String> {
           @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }
    public static void sortedByLength (){
        listOfNumbers.sort(new CompareTo());
        System.out.println(listOfNumbers);
    }
        public static void main(String[] args) {
        createListOfNumbers();
        chooseMaxAndMinLength();
        sortedByLength();

    }
}
