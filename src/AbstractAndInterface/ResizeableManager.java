package AbstractAndInterface;

import java.util.Random;

public class ResizeableManager {
    private Shape[] shapes;
    private int number, top;

    public ResizeableManager(int number){
        this.number = number;
        shapes = new Shape[number];
    }

    public void Add(Shape shape){
        if(top < number){
            shapes[top] = shape;
            top++;
        } else {
            Shape[] shapes2 = new Shape[number + 1];
            for (int i = 0; i < number; i++){
                shapes2[i] = shapes[i];
            }

            shapes2[top] = shape;
            top++;
            shapes = shapes2;
        }
    }

    public void show(){
        int i = 0;
        for(Shape shape: shapes){
            if(i < top){
                System.out.println(" Shape " + (i + 1) + " is: " + shape);
                i++;
            }
        }
    }

    public void getSize(Shape shape){
        System.out.println("Size of " + shape.getName() +" not changed is: " + shape.getArea());
    }

    public void random(Shape shape){
        Random random = new Random();
        for(int i = 0; i < 5; i++){

            int randomNumber = random.nextInt(100);
            double sum = randomNumber + shape.getArea();
            System.out.println("Random " + shape.getName() + " size is changed : " + sum);
        }
    }
}
