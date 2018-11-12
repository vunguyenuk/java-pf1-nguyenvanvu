package BST.CountWords;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        String str = "ABGFDFDFGDS";
        String[] arr = str.split("");


        Map<String, Integer> treeMap = new TreeMap<>();
        for(String word : arr){
           Integer oldCount = treeMap.get(word);
           if(oldCount == null){
               oldCount = 0;
           }
           treeMap.put(word, oldCount + 1);
        }

        //print result

        for(String word : treeMap.keySet()){
              System.out.println("word '" + word + "' appear: " + treeMap.get(word) + " round");
        }


    }
}

