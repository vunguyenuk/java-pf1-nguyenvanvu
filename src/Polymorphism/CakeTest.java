package Polymorphism;

import java.util.Scanner;

public class CakeTest {
    public static void main(String[] args) {
       CakeManager cakeManager = new CakeManager(3);
       cakeManager.add(new OrderCake("banh bong lan", 1, 3));
       cakeManager.add(new OrderCake("banh tiramisu", 2, 4));
       cakeManager.add(new ReadyMadeCake("banh flan", 3,1));
       cakeManager.add(new ReadyMadeCake("banh pia", 3, 2));
       //cakeManager.add(new ReadyMadeCake("banh pizza", 4, 2));
       cakeManager.show();

        System.out.println(cakeManager.calcTotalPrice());
    }



}
