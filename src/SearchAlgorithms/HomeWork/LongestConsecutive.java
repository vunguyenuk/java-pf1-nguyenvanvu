package SearchAlgorithms.HomeWork;

import java.util.Scanner;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        int start = 0, end = 0, max = 0, count = 1, indexMax = 0, indexMin = 0;
        String input = scan.nextLine();
        for (int i = 1; i < input.length(); i++) {
            int asciiPre = (int) input.charAt(i - 1);
            int asciiCurrent = (int) input.charAt(i);
            end = i;
            if(asciiPre < asciiCurrent && findCharInString(input, input.charAt(i), start, end)) {
                count++;
                if(i == input.length() - 1 && count > max) {
                    max = count;
                    indexMax = end;
                    indexMin = start;
                }
            }
            else {
                if(count > max ) {
                    max = count;
                    indexMax = end;
                    indexMin = start;
                }
                count = 1;
                i++;
                start = i;
            }
        }
        System.out.println(input.substring(indexMin-1, indexMax));
    }

    public static boolean findCharInString(String str, char c, int start, int end) {
        for (int i = start; i < end; i++) {
            if (str.charAt(i) == c)
                return false;
        }
        return true;
    }
}