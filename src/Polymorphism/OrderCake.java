package Polymorphism;

public class OrderCake extends Cake{
    public double weight;

    public OrderCake(String name, double rate, double weight) {
        super(name, rate);
        this.weight = weight;
    }

    public double priceCalculation(){
        return rate*weight;

    }
}
