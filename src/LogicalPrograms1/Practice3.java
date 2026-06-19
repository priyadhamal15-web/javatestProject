package LogicalPrograms1;

import java.util.Arrays;

public class Practice3 {
    static void main(String[] args) {
        String s1="java";
        String s2="avaj";

        char[] ar1=s1.toCharArray();
        char[] ar2=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if (Arrays.equals(ar1,ar2))
        {
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String is not Anagram");
        }
    }
}
