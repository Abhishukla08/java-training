import java.util.ArrayList;

public class collection_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//        System.out.println(list.get(0));
//        list.set(1,40);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains(10));
    }
}
