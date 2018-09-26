package method;

public class hienThiChuoi {
    public static void main(String[] args) {
        String c = nhapChuoi("Heloo", "world");
        System.out.println(c);
    }

    public static String nhapChuoi(String chuoi1, String chuoi2){
        return chuoi1 + " " + chuoi2;
    }
}
