package Polymorphism;

public class CakeManager {
    private Cake[] cakes;
    private int number, top;

    public CakeManager( int number) {
        this.number = number;
        cakes = new Cake[number];
    }

    public int getNumber() {
        return number;
    }

    public Cake[] getCakes() {
        return cakes;
    }

    public void add(Cake cake){
        if(top < number){
            cakes[top] = cake;
            top++;
        } else {
            Cake[] cakes1 = new Cake[number + 10];
            for (int i = 0;i < number;i++){
                cakes1[i] = cakes[i];
            }
            number += 10;
            cakes1[top] = cake;
            top++;
            cakes = cakes1;
        }

    }
    public double calcTotalPriceOfOrderCake(){
        double sum = 0;
        for (int i = 0; i < top; i++ )  {
            if (cakes[i] instanceof OrderCake){
                sum += cakes[i].priceCalculation();
            }
        }
        return sum;
    }

    public double calcTotalPriceOfReadyMadeCake(){
        double sum = 0;
        for (int i = 0; i < top; i++ ) {
            if (cakes[i] instanceof ReadyMadeCake){
                sum += cakes[i].priceCalculation();
            }
        }
        return sum;
    }

    public double calcTotalQuantityReadyMadeCake(){
        double sum = 0;
        for (int i = 0; i < top; i++ ) {
            if (cakes[i] instanceof ReadyMadeCake){
                sum += ((ReadyMadeCake)cakes[i]).quantity;
            }
        }
        return sum;
    }

    public double calcTotalPrice(){
        double sum = 0;
        for (int i = 0; i < top; i++) {
            sum += cakes[i].priceCalculation();
        }
        return sum;
    }

    public void showInforCakeOfHeight(){
        double max = cakes[0].priceCalculation();
        int position = 0;
        for (int i = 0; i < top; i++ ) {
            if(cakes[i].priceCalculation() > max){
                max = cakes[i].priceCalculation();
                position = i;
            }
        }
        String priceHeight = cakes[position].toString();
        System.out.println("Information of the cake has the heighest price: " + priceHeight);
    }

    public void show(){
        int i = 0;
        for (Cake cake : cakes){
            if(i < top){
                System.out.println("banh thu " + (i + 1) + " : " + cake);
                i++;
            }

        }

    }
}
