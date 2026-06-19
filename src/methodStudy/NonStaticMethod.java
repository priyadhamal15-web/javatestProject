package methodStudy;

public class NonStaticMethod {
    static void main(String[] args) {
        //Non static method in same class
//syntax--> we have creating an object
      //  ClassName objectname=new ClassName();
        //objectname.methodname();

        NonStaticMethod nonstaticmethod=new NonStaticMethod();
        nonstaticmethod.demo();
     StaticMethod staticmethod=new StaticMethod();
       staticmethod.test3();


    }
    public void demo(){
        System.out.println("Non static method in same class");
    }
}

