class employee{
    void work(){
        System.out.println("employee is working");
    }
}
class manager extends employee{
    void attendmeeting(){
        System.out.println(" i am attending meeting");
    }
}

public class practiceinherit {
    public static void main(String[] args) {
        manager m1=new manager();
        m1.attendmeeting();
        m1.work();
    }
}
