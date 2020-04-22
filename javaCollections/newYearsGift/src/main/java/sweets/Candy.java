package sweets;

import typesOfSweet.CandieType;

public class Candy extends Sweet {
    private CandieType type;

    public Candy(String name, double sugarPercent, double weight, double pricePerKg, CandieType type) {
        super(name, sugarPercent, weight, pricePerKg);
        this.type = type;
    }

    public CandieType getType() {
        return type;
    }

    public void setType(CandieType type) {
        this.type = type;
    }

    public String toString (){
        return this.type + " candy, " + super.toString();
    }
}
