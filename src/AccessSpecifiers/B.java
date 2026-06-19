package AccessSpecifiers;

public class B {
    //default
    //protected
    //public
    static void main(String[] args) {

        A a=new A();
        a.test2();
        a.test3();
        a.test4();
     // int sum1=1+a.p;
        int Sum2=1+a.q;
        int sum3=1+a.r;
        int sum4=1+a.s;

        System.out.println(Sum2);
        System.out.println(sum3);
        System.out.println(sum4);

    }
}
