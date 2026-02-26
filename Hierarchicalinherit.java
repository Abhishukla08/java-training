class animall{
    void speak(){
        System.out.println(" hii ");
    }
}
class cat extends animall{
    void eat(){
        System.out.println("meow");
    }
}
class Dogg extends animall{
    void eeat(){
        System.out.println("bhow bhow");
    }
}
public class Hierarchicalinherit {
    public static void main(String[] args) {
        cat c1=new cat();
        Dogg d1 =new Dogg();
        c1.eat();
        c1.speak();
        d1.eeat();
        d1.speak();
    }
}
