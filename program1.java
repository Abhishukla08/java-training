public class program1 {
    public static void main(String[] args) {
     String s1="hello";
     String rev="";

        for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        System.out.println(rev);
        if(s1.equals(rev) ){
            System.out.println("is pallendrone");
        }
        else {
            System.out.println( "is not a pallendrone" );
        }

    }
}
