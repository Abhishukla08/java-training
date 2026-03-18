import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        String str1 ="hello";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str1.length();i++)
        {
            s.push(str1.charAt(i));
        }
        String s1="";
        while (!s.isEmpty()){
            s1+=s.pop();
        }
        System.out.println(s1);
    }
}
