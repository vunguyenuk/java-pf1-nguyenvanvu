package Polymorphism;

public class ReadyMadeCake extends Cake {
    public int quantity;

    public ReadyMadeCake(String name, double rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    @Override
    public double priceCalculation(){
        return rate * quantity;
    }

    @Override
    public String toString() {
        return super.toString() +  "\t" + quantity;
    }
}
