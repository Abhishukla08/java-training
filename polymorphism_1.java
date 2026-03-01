// method overloading

public class polymorphism_1 {
    void add(){
        System.out.println(" hello");
    }
    void add(int a){
        System.out.println("hiii");
    }
    void add(int a ,int b){
        System.out.println("hey");
    }

    public static void main(String[] args) {
        polymorphism_1 p1=new polymorphism_1();
        p1.add();
        p1.add(6);
        p1.add(84,52);
    }
}
