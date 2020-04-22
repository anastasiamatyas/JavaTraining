package sweets;

import java.util.Comparator;

abstract public class Sweet {
    private String name;
    private double sugarPercent;
    private double weight;
    private double pricePerKg;
    private double price;

    public static class pricePerKgComparator implements Comparator<Sweet> {
        @Override
        public int compare(Sweet o1, Sweet o2) {
            return (int)o1.getPricePerKg()*100 - (int)o2.getPricePerKg()*100;
        }
    }

    public Sweet(String name, double sugarPercent, double weight, double pricePerKg) {
        this.name = name;
        this.sugarPercent = sugarPercent;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
        this.price = weight*pricePerKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(double sugarPercent) {
        this.sugarPercent = sugarPercent;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", sugarPercent=" + sugarPercent +
                ", weight=" + weight + " kg" +
                ", pricePerKg=" + pricePerKg + " BYN"+
                ", price=" + price + " BYN";
    }
}

