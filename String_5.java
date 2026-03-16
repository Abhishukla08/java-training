import java.util.Scanner;

public class String_5 {


    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static int maxVowels(String s, int k) {
        int maxCount = 0;
        int currentCount = 0;


        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
        }
        maxCount = currentCount;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }

            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring size k: ");
        int k = sc.nextInt();

        int result = maxVowels(str, k);

      System.out.println("Maximum vowels in substring of size " + k + " = " + result);


    }
}