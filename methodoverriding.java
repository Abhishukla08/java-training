class animalll {
    void sound() {
        System.out.println("animal");
    }
}
    class doggg extends animalll{
        void sound (){
            System.out.println("dog");
        }
    }
    class catt extends animalll {
        void sound(){
            System.out.println("cat");
        }
    }


public class methodoverriding {
    public static void main(String[] args) {
        animalll a = new doggg();
        animalll b = new catt();
        a.sound();
        b.sound();
    }
}