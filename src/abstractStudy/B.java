package abstractStudy;

public class B extends A{

  public static void main(String[] args) {
        B b=new B();
        b.show1();
        b.show2();
        b.show3();
        b.show4();
        b.show5();
        display9();
        display8();

    }

    @Override
    public void show3() {
      System.out.println("override the mehod of show3");

    }

    @Override
    public void show4() {
        System.out.println("override the mehod of show4");
    }

    @Override
    public void show5() {
        System.out.println("override the mehod of show5");

    }

    public static void display9()
    {
        System.out.println("display9 method implemented in B class");
    }
    public static void display8()
    {
        System.out.println("display8 method implemented in B class");
    }

}
