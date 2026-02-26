class laptop{
    String brand;
    int Ram;
    float price;
    public laptop( String brand,int Ram, float price){
        this.brand=brand;
        this.Ram=Ram;
        this.price=price;
    }
    void details(){
        System.out.println(brand+" "+Ram+" "+price);
    }
}
public class construct1 {
    public static void main(String[] args) {
        laptop lap1=new laptop("hp",8,72000);
        laptop lap2=new laptop("lenovo",16,50000);
        lap1.details();
        lap2.details();
    }
}
