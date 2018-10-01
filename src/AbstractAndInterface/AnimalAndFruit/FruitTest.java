package AbstractAndInterface.AnimalAndFruit;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
