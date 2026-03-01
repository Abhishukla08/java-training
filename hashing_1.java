import java.util.*;

public class hashing_1 {
    public static void main(String[] args) {
        String str = "hello";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
//          if (map.get(ch)==1){
//              System.out.println(map);

        }
        System.out.println(map);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println(ch);
//                break;
            }
        }

    }
}