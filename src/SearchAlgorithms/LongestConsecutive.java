package SearchAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestConsecutive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        ArrayList<Character> arrayList = new ArrayList();

        for (int i = 0; i < input.length(); i++) {
            ArrayList<Character> list = new ArrayList<>();
            list.add(input.charAt(i));

            for(int j = i + 1; j < input.length(); j++) {
                if(input.charAt(j) > list.get(list.size() - 1)) {
                    list.add(input.charAt(j));
                }
            }

            if (list.size() > arrayList.size()) {
                arrayList.clear();
                arrayList.addAll(list);
            }
            list.clear();
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }

    }
}
