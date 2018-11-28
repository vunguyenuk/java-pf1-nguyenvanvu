package OOP;

/*
Write the program as follows:

Enter 3 values for a, b, c and display the result based on the delta calculation.
If delta> = 0, show 2 solutions. If delta is 0,
Displays a solution (due to two equations).
Left displays the string "The equation has no roots"
Note: Use Math.pow (x, 0.5) to calculate the square root of x.

*/

public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(1,-8,16);

        if(qe.getDiscriminant() > 0){
            System.out.println("Roots are real and unequal: ");
            System.out.println("x1 = " + qe.getRoot1());
            System.out.println("x2 = " + qe.getRoot2());
            System.out.println(qe.getDiscriminant());
        } else if(qe.getDiscriminant() == 0){
            System.out.println("Roots are real and equal x1 = x2 = " + qe.getEquationSolution());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
