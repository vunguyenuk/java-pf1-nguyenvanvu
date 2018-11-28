package Polymorphism;

import java.util.Scanner;

public class CakeTest {
    public static void main(String[] args) {
       CakeManager cakeManager = new CakeManager(3);
       cakeManager.add(new OrderCake("custard cake", 1, 3));
       cakeManager.add(new OrderCake("tiramisu cake", 2, 4));
       cakeManager.add(new ReadyMadeCake("cheese cake", 3,1));
       cakeManager.add(new ReadyMadeCake("coconut cake", 3, 2));
//       cakeManager.add(new ReadyMadeCake("banh pizza", 4, 2));
       cakeManager.show();
        System.out.println(cakeManager.getCakes().length);
        System.out.println("Sum of cakes price: " + cakeManager.calcTotalPrice());
        System.out.println("Sum of readyMakeCake price: " + cakeManager.calcTotalPriceOfReadyMadeCake());
        System.out.println("Sum of readyMakeCake quantity: " + cakeManager.calcTotalQuantityReadyMadeCake());
        cakeManager.showInforCakeOfHeight();
    }



}
