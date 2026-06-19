package methodStudy;

public class Arithmatic {
    static void main(String[] args) {
        addition();
        Arithmatic arithmatic=new Arithmatic();
        arithmatic.subtraction();
        Arithmatic2.multiplication();
Arithmatic2 arithmatic2=new Arithmatic2();
arithmatic2.division();

    }

    public static void addition(){
        int a=10;
        int b=20;
        int add=a+b;
        System.out.println("My Addition is "+ add);

    }
    public void subtraction(){

        int x=50;
        int y=100;
        int sub= y-x;
        System.out.println("My Subtraction is "+sub);
    }
}



