class student {
    int rollno;
    String name;

    public student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void details() {
        System.out.println(rollno + " " + name);
    }
}
public class construct {
    public static void main(String[] args) {
        student stud1 = new student(10, "Abhinav");
        student stud2 = new student(11, "Nayan");
        stud1.details();
        stud2.details();
    }
}