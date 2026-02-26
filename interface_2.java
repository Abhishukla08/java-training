// multiple inheritance
interface vegetable{
    void tomato();
}
interface fruits{
    void tomato();
}
class tasty implements vegetable ,fruits{
   public void tomato(){
        System.out.println("wow..");
    }
}

public class interface_2 {
    public static void main(String[] args) {
        tasty t1=new tasty();
        t1.tomato();
    }
}
