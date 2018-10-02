package Polymorphism;

public class OrderCake extends Cake{
    public double weight;

    public OrderCake(String name, double rate, double weight) {
        super(name, rate);
        this.weight = weight;
    }

    @Override
    public double priceCalculation(){
        return rate*weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + weight;
    }
}
