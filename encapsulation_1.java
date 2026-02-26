class studenttt{
    private String name;
    private int marks;
      public studenttt( String a, int m){
          this.name= a;
          this.marks = m;
      }
    public String name(){
          return name;

    }
    public int marks(){
          return marks;
    }

}
public class encapsulation_1 {
    public static void main(String[] args) {
        studenttt s1 = new studenttt("abhi",1);
        System.out.println(s1.marks());
        System.out.println(s1.name());
    }

}
