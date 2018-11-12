package BST;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vu", 23);
        hashMap.put("Dung", 24);
        hashMap.put("Van", 26);
        hashMap.put("Hop",25);
        hashMap.put("Lewis", 29);
        hashMap.put("Cool", 31);
        hashMap.put("Book", 23);
        hashMap.put("Handsome", 29);
        System.out.println("Display entries in hashMap");
        System.out.println(hashMap + "\n");

        //LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cool", 31);
        linkedHashMap.put("Book", 23);
        linkedHashMap.put("Handsome", 29);
        linkedHashMap.put("Vu", 23);
        linkedHashMap.put("Dung", 24);
        linkedHashMap.put("Van", 26);
        linkedHashMap.put("Hop",25);
        System.out.println("Display entries linkedHashMap");
        System.out.println(linkedHashMap + "\n");

        //TreeNode
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
    }
}
