package myPackage;

import AccessSpecifiers.A;

public class C extends A{

    static void main(String[] args) {

        A a=new A();
        a.test4();

        C c=new C();
        c.test3();
        c.test4();


System.out.println(c.r);
System.out.println(c.s);

    }
}
