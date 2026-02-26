interface pakshi{
    void fly() ;

}
class crow implements pakshi{
    public void fly(){
        System.out.println(" flying..");
    }
}
public class interface_1 {
    public static void main(String[] args) {
        pakshi b1=new crow();
        b1.fly();
    }
}
