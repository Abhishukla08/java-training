//  single level Inheritance
class Aanimal{
    void eat (){
        System.out.println("pizza..");
    }
}
class dog extends Aanimal{
    void bark(){
        System.out.println("barking");
    }
}

public class animal {
    public static void main(String[] args) {
        dog s1=new dog();
        s1.bark();
    }
}
