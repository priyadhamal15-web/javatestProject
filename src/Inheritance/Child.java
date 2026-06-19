package Inheritance;

public class Child extends Father{
//GandFather, Father, Child=====> use for Multilevel inheritance
    String color="White";
    String nature="Pure";

   public static void main(String[] args) {

        Alpha();
      Child child=new Child();
      child.Beta();
Child.display2();
child.show2();
Child.display1();
child.show1();

System.out.println("This is "  +child.car);
System.out.println("This is " +child.bunglow);
    }




    public static void Alpha()
    {
      System.out.println("child's color");
    }

    public void Beta()
    {
        System.out.println("Child's nature ");
    }


}
