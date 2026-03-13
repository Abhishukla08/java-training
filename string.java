public class string {
    public static void main(String[] args) {
        String a="hello world";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        System.out.println(a.substring(3));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i)+" ");
        }
        System.out.println(a.contains(" world"));
        System.out.println(a.replace("l","o"));
    }
}
