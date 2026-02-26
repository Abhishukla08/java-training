class stud {
    void  work(){
        System.out.println(" done");
    }
}
class hod extends stud{
    void noitce(){
        System.out.println(" notice send");
    }
}
class professor extends hod{
    void info(){
        System.out.println(" branch");
    }
}
public class mutiinherit {
    public static void main(String[] args) {
        professor p1=new professor();
        p1.info();
        p1.noitce();
        p1.work();
    }
}
