package method;

import java.util.Scanner;

public class SynmmetricalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string's symmetry: ");
        String str = sc.nextLine();

        chuoiDoiXung(str);
    }


    public static void chuoiDoiXung(String s){
        String cutInitialStr = s.substring(0, s.length() / 2);
        String cutNextStr = s.substring(s.length() - s.length() / 2);

        if (cutInitialStr.equals(new StringBuffer(cutNextStr).reverse().toString())) {
            System.out.println(s + "is symmetry");
        } else {
            System.out.println("is not symmetry");
        }
    }

//    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        System.out.println("Enter string's symmetry: ");
//        String s = ip.nextLine();
//
//        if(isPalindrome(s)){
//            System.out.println(s + " is symmetry");
//        }else {
//            System.out.println("is not symmetry!");
//        }
//    }
//    public static boolean isPalindrome (String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right))
//                return false;
//            left++;
//            right--;
//        }
//        return true;
//    }
}
