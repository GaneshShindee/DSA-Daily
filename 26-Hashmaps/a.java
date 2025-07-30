import java.util.*;
public class a {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("bhutan", 1);
        hm.put("pakistan", 10);

        hm.get("India");
        System.out.println(hm.get("bhutan")); 
        Set<String> keys =hm.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println("Key="+key +" ," + "Value="+ hm.get(key));
        }

    }
}

