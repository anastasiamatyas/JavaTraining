package sweets;

import typesOfSweet.ChocolateType;

public class Chocolate extends Sweet{
    private ChocolateType type;

    public Chocolate (String name, double sugarPercent, double weight, double pricePerKg, ChocolateType type){
        super(name, sugarPercent, weight, pricePerKg);
        this.type = type;
    }

    public ChocolateType getType() {
        return type;
    }

    public void setType(ChocolateType type) {
        this.type = type;
    }

    public String toString(){
        return this.type + " chocolate, " + super.toString();
    }
}
