package BST.CountWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        for(String str : list){
            if(hashMap.containsKey(str)){
                hashMap.put(str, hashMap.get(str) + 1);
            } else {
                hashMap.put(str,1);
            }
        }

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println("key word: '" + entry.getKey() + "' appear: " + entry.getValue());
        }

    }
}
