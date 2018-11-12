package SearchAlgorithms;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));

            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(j) > list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }

            list.clear();
        }

        for(Character ch : max){
            System.out.print(ch);
        }
        System.out.println();
    }
}
