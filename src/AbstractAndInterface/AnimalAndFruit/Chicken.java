package AbstractAndInterface.AnimalAndFruit;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuctoast";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
