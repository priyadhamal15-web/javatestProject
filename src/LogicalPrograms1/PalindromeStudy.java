package LogicalPrograms1;

public class PalindromeStudy {
    static void main(String[] args) {
        String s = "madam";
        String rev = "";
        String s1 = s.toLowerCase();

        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            rev = rev + temp;

        }
        System.out.println("Given String is " + s1);
        System.out.println("Reverse String is " + rev);

        if (s1.equals(rev)) {
            System.out.println("Given String is Palindrome ");
        } else {
            System.out.println("Given String is not palindrome ");
        }
    }
}
