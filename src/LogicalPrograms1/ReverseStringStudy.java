package LogicalPrograms1;

class ReverseStringStudy {

    static void main(String[] args) {
        String s = "karan";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            rev = rev + temp;
        }
        System.out.println("Given String is " + s);
        System.out.println("Reverse String is " + rev);

    }
}