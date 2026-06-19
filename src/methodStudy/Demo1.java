package methodStudy;

public class Demo1 {
    static void main(String[] args) {
        test();
        test1();
        MethodDemo2 methoddemo2=new MethodDemo2();
        methoddemo2.method2();

   MethodDemo2 methodDemo2=new MethodDemo2();
   methoddemo2.method();

    }

    public static void test() {

        System.out.println("Study of static method");
    }
    public static void test1(){

        System.out.println("Study of non static method");
    }
}