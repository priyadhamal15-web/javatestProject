package loops;

public class ForLoop {
    static void main(String[] args) {

        for(int a=20; a<=200; a=a+20)
        {
            System.out.println(a);
        }
        System.out.println("=========");
        {
            for(int a=200; a>=20; a=a-20)
            {
                System.out.println(a);
            }
        }
    }
}
