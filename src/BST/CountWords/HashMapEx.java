package BST.CountWords;

import java.util.*;


public class HashMapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vu");
        list.add("Sang");
        list.add("Son");
        list.add("Van");
        list.add("Hoang");
        list.add("Dung");
        list.add("Vu");
        list.add("Sang");

        Map<String, Integer> hashMap = new HashMap <>();
        for(String string : list){
            if(hashMap.containsKey(string)){
                hashMap.put(string, hashMap.get(string) + 1);
            }else{
                hashMap.put(string, 1);
            }
        }

        System.out.println("Cach 1: ");
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println("key word: '" + entry.getKey() + "' appear: " + entry.getValue());
        }


        System.out.println("\nCach 2: ");
        Set<Map.Entry<String, Integer>> KeySet = hashMap.entrySet();
        for(Map.Entry<String, Integer> key : KeySet)
        System.out.println("key word: '" + key.getKey() + "' appear: " + key.getValue());


        System.out.println("\nCach 3: ");
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println("Key word: '" + iterator.next());
        }
    }
}
