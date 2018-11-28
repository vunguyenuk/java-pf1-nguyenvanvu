package method;

public class ShowString {
    public static void main(String[] args) {
        String c = enterString("Heloo", "world");
        System.out.println(c);
    }

    public static String enterString(String str1, String str2){
        return str1 + " " + str2;
    }
}
