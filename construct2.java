class calculator{
    int a;
    int b;
    public calculator( int a,int b){
        this.a=a;
        this.b=b;
    }
    void result(){
        System.out.println("addition" + (a+b));
        System.out.println("subtraction" + (a-b));
        System.out.println("multiply"+ (a*b));
        System.out.println("divide"+ (a/b));
    }
}
public class construct2 {
    public static void main(String[] args) {
        calculator calc=new calculator(52,20);
                calc.result();
    }
}
