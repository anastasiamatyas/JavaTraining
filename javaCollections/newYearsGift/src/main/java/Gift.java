import sweets.Sweet;
import java.util.ArrayList;
import java.util.Scanner;

public class Gift {
    private  ArrayList<Sweet> gift;

    public Gift(ArrayList<Sweet> gift) {
        this.gift = gift;
    }

    public double getWeight() {
        double giftWeight = 0;
        for (Sweet sweet : gift) {
            giftWeight += sweet.getWeight();
        }
        return giftWeight;
    }

    public void findSweetWithSugar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter minimum percent of sugar:");
        double minPercentSugar = scan.nextDouble();
        System.out.println("Enter maximum percent of sugar:");
        double maxPercentSugar = scan.nextDouble();
        ArrayList <Sweet> filteredGiftBySugar = new ArrayList<>();
        for (Sweet sweet : gift) {
            if ((sweet.getSugarPercent() >= minPercentSugar && sweet.getSugarPercent() <= maxPercentSugar))
                filteredGiftBySugar.add(sweet);
            }
        if (filteredGiftBySugar.size() > 0) {
            for (Sweet sweet : filteredGiftBySugar) {
                System.out.println(sweet.getName() + " contains " + sweet.getSugarPercent() + "% of sugar");
            }
        }
        else {
                System.out.println("Choose other values.");
                findSweetWithSugar();
        }
    }

    public ArrayList<Sweet> sortByPrice() {
        gift.sort(new Sweet.pricePerKgComparator());
        return gift;
    }
}
