 abstract class shape {
     abstract void area(int a, int b);
 }
    class circle extends shape{
        void area( int a, int b){
            System.out.println(3.14*a*a);
        }
    }
    class rectangle extends shape{
        void area(int a,int b){
            System.out.println(a*b);
        }
    }

public class abstract2 {
    public static void main(String[] args) {
        shape s1 = new circle();
        s1.area(3, 5);
        shape s2 = new rectangle();
        s2.area(25, 20);

     }
    }

