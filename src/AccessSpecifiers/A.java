package AccessSpecifiers;

public class A {

    private int p=10;
    int q=20;
    protected int r=30;
    public int s=40;
     //private
    //default
    //protected
    //public

    static void main(String[] args) {
        A a=new A();
                a.test1();
                a.test2();
                a.test3();
                a.test4();
         int Sum1= 1+a.p;
         int sum2=1+a.q;
         int sum3=1+a.r;
         int sum4=1+a.s;
         System.out.println(Sum1);
         System.out.println(sum2);
         System.out.println(sum3);
         System.out.println(sum4);

    }
    private void test1()
    {
        System.out.println("A's class of method test1");
    }
    void test2()
    {
        System.out.println("A's class of method test2");
    }
    protected void test3()
    {
        System.out.println("A's class of method test3");
    }
    public void test4()
    {
        System.out.println("A's class of method test4 ");
    }
}
