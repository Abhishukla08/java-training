public class string_4 {
    public static void main(String[] args) {
        String st1 = " java programming language";
        String[] st2 = st1.split("");
        for (String str3 : st2) {
            String temp = "";
            for (int i = str3.length() - 1; i >= 0; i--) {
                temp+=str3.charAt(i);
//                System.out.println(temp);
            }
//            System.out.println(temp);
            System.out.println(temp);
        }

    }
}
