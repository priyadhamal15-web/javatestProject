package study;

public class swappingProgram {
    static void main(String[] args) {

        int a = 10;
        int b = 20;
        {
            System.out.println("a= " + a + " b= " + b);

            int temp = a;
            a = b;
            b = temp;


            System.out.println("b= " + b + " a= " + a);

        }
    }
}
