package SearchAlgorithms;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLargestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        for(int i = 0; i < input.length(); i++){
            if(list.size() > 1 && input.charAt(i) <= list.getLast() && list.contains(input.charAt(i))) {
                list.clear();
            }

            list.add(input.charAt(i));

            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }

        }

        //Display maximum consecutive
        for(Character character : max){
            System.out.print(character);
        }
        System.out.println();
    }
}
