package AccessModifier;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(23);
        MyInteger int2 = new MyInteger(56);
        MyInteger int3 = new MyInteger(2);
        MyInteger int4 = new MyInteger(23);

        System.out.printf("%d is the prime number? %s%n", int1.getValue(), int1.isPrime());
        System.out.printf("%d is the prime number? %s%n", int2.getValue(), int2.isPrime());
        System.out.printf("%d is the prime number? %s%n", int3.getValue(), int3.isPrime());

        System.out.printf("%d is the even number? %s%n", int1.getValue(), int1.isEven());
        System.out.printf("%d is the even number? %s%n", int2.getValue(), int2.isEven());
        System.out.printf("%d is the even number? %s%n", int3.getValue(), int3.isEven());

        System.out.printf("93 is the odd number? %s%n", MyInteger.isOdd(93));

        System.out.printf("%d comparing %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));

        System.out.printf("%d%n", MyInteger.parseInt(new char[] {'a','1'}));
        System.out.printf("%d%n", MyInteger.parseInt("454"));

    }
}
