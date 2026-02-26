class atm{
    private int paisa;
    public atm(int r){
        this.paisa=r;
    }
    public int gatter(int a){
        return paisa -a;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        atm a1=new atm(500);
        System.out.println(a1.gatter(200));
    }
}
