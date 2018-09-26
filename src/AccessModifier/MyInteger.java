package AccessModifier;

public class MyInteger {
    public int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
       return (value % 2) == 0;
    }

    public boolean isOdd(){
        return (value % 2) == 1;
    }

    public boolean isPrime(){
        if(value < 2){
            return false;
        }else {
            for (int i = 2; i < Math.sqrt(value); i++){
                if(i % value == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEven(int myInt){
       return (myInt % 2) == 0;
    }

    public static boolean isOdd(int myInt){
        return (myInt % 2) == 1;
    }

    public static boolean isPrime(int myInt){
        if(myInt < 2){
            return false;
        }else {
            for (int i = 2; i < Math.sqrt(myInt); i++){
                if(i % myInt== 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt){
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt){
       return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt){
        return myInt.isPrime();
    }

    public boolean equals(int testInt){
        if(testInt == value){
            return true;
        }
        return false;
    }

    public boolean equals(MyInteger myInt){
        if(myInt.value == this.value){
            return true;
        }
        return false;
    }

    public static int parseInt(char[] kytu){
        int sum = 0;
        for(int i : kytu){
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
