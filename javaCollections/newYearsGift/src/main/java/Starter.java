import sweets.Candy;
import sweets.Chocolate;
import sweets.Cookie;
import sweets.Sweet;
import typesOfSweet.CandieType;
import typesOfSweet.ChocolateType;

import java.util.ArrayList;

public class Starter {

    public static ArrayList<Sweet> makeGift() {
        ArrayList<Sweet> gift = new ArrayList<>();
        gift.add(new Candy("Red Riding Hood", 58, 0.100, 8.24, CandieType.CHOCOLATE));
        gift.add(new Chocolate("Kommunarka", 40, 0.100, 21.20, ChocolateType.DARK));
        gift.add(new Cookie("Slodych for tea",30, 0.200, 4.10));
        gift.add(new Candy("Duchess", 97.4, 0.05, 5.60, CandieType.CARAMELS));
        gift.add(new Candy("Chupa-chups", 98.1, 0.04,28.99, CandieType.LOLLIPOPS));
        gift.add (new Candy("BonPari",71, 0.15,15.82,CandieType.GUMMIES));
        gift.add(new Chocolate("Roshen White", 53.5, 0.08,22.37,ChocolateType.WHITE ));

        return gift;
    }

    public  static void main (String[] args) {

        Gift gift = new Gift(makeGift());
        System.out.println(gift.sortByPrice());
        System.out.println("Weight of gift is " + gift.getWeight() + "kg.");
        gift.findSweetWithSugar();
    }
}

