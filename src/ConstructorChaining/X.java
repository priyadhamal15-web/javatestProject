package ConstructorChaining;

public class X {

    public X()
        {
            this(20);
System.out.println("user defined without  parameter constructor");
        }

        public X(int a)
        {
            this("Welcome");
            System.out.println("user defined with parameter2 constructor");
            System.out.println(a);
        }
        public X(String a)
        {
            System.out.println("user defined with parameterzed1 constructor");
            System.out.println(a);
        }

    static void main(String[] args) {
        X x=new X();
    }
}
