import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class hashing {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,20);
        map.put(2,20);
        map.put(3,30);
        System.out.println(map.get(0));
        map.remove(1);
        System.out.println(map.containsKey(3));
    }
}
