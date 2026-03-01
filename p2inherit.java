class person{
    void displayname(){
        System.out.println("name ");
    }
}
class studentt extends person{
    void displayclass(){
        System.out.println("class");
    }
}
class monitor extends studentt{
    void checkdisciplibe(){
        System.out.println(" discipline is nice ");
    }
}

public class p2inherit {
    public static void main(String[] args) {
      monitor M=new monitor();
      M.checkdisciplibe();
      M.displayclass();
      M.displayname();
    }

}
