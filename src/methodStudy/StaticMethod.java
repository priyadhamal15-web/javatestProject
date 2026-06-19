package methodStudy;

public class StaticMethod {
    static void main(String[] args) {
 //  Static Method in Same Class
        //syntax--> methodname();
        test1();
        test2();

        //calling non static method in same class, we create an object

        //syntax--> ClassName objectname=new ClassName();
        //objectname.methodname();


        StaticMethod staticmethod=new StaticMethod();
        staticmethod.test3();
    }
        public static void test1 () {

            System.out.println("Static method in same class");

        }

        public static void test2(){
        System.out.println("Static Method in Same Class");

        }
        //calling non static method in same class
    //objectname.methodname();
    public void test3(){
        System.out.println("Non static method in same class1");
    }


    }



