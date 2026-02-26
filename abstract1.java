
    abstract  class vimal{
        abstract void sound();
    }
     class rajshree extends vimal{

         void sound() {
             System.out.println("zuba kesari");
         }
     }
public class abstract1 {
    public static void main(String[] args) {
        vimal v1=new rajshree();
        v1.sound();
        }
    }

