package SearchAlgorithms.HomeWork;

import java.util.LinkedList;

public class LongestConsecutive {
    public static void main(String[] args) {
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        String string = "abcabcdgabxy";

        int i = 0;
        while (i < string.length()) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            i++;
        }
        for (int j = 0; j < max.size(); j++) {
            System.out.print(max.get(j));
        }
    }
}