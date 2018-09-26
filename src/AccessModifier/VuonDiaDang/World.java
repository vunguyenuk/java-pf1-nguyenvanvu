package AccessModifier.VuonDiaDang;

public class World {
    private static final boolean MALE = true;
    private static final boolean FEMALE = false;
    public static void main(String[] args) {
        System.out.println("=====Garden of Eden=====");
        System.out.println("1. Adam was born!");
        Human adam = new Human("Adam", MALE);
        System.out.println("name: " + adam.getName() + ", sex: " + adam.getGender());

        System.out.println("2. Eva was born!");
        Human eva = new Human("Eva", FEMALE);
        System.out.println("name: " + eva.getName() + ", sex: " + eva.getGender());

        System.out.print("3. God say: ");
        String godSay = "Do not eat apples if you eat apples you will die!!";
        God.say(godSay);

        System.out.print("4. Snake say: ");
        String snakeSay = "Take a bite, it's very delicious";
        Snake.say(snakeSay);

        Apple apple = new Apple();
        do{
            System.out.println("5.1. Adam eat a bite");
            adam.eat(apple);
            System.out.println("5.2. Eva eat a bite");
            eva.eat(apple);

        }while (!apple.isEmpty());

        if(apple.isEmpty()){
            System.out.println("Out of Apple");
        }
        System.out.print("6.1. Adam sleep: ");
        adam.sleep();
        System.out.print("6.2. Eva sleep: ");
        eva.sleep();

        System.out.println("7. God say: ");
        God.say("Eva !. You will have to obey your husband and have pain when giving birth");
        God.say("Adam!. You have must to plant a tree and eat it");

        System.out.println("8. End");

    }
}
