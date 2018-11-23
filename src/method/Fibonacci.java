package method;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonaci(5));
    }

    public static int Fibonaci(int n) {
        if(n == 0 || n == 1){
            return 1;
        }else{
            return Fibonaci(n - 1) + Fibonaci(n - 2);
        }
    }
}
