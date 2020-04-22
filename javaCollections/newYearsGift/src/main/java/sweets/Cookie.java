package sweets;

public class Cookie extends Sweet {
    public Cookie (String name, double sugarPercent, double weight, double pricePerKg){
        super(name, sugarPercent, weight, pricePerKg);
    }

    public String toString(){
       return " Cookie " + super.toString();
    }
}
