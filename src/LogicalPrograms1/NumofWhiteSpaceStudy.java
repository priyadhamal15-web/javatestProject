package LogicalPrograms1;

public class NumofWhiteSpaceStudy {
    static void main(String[] args) {
        String s = "Test   ing";
        int counter = 0;
        for (int i = 0; i <= s.length()-1; i++) {
            char temp = s.charAt(i);
            if (temp ==' ')
            {
                counter++;
        }
    }
        System.out.println("Number of White Spaces is " +counter);

    }
}
