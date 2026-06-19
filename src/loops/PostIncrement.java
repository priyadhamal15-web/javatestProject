package loops;

public class PostIncrement {
    static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a);

        int p=a;
        System.out.println("a "+a);
        System.out.println("p " +p);

        System.out.println("============");
        int q=b++;       //post increment
        System.out.println("b--->" +b);
        System.out.println("q--->" +q);
    }
}
