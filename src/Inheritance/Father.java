package Inheritance;

public class Father extends GrandFather {
    float height=5.6f;
    float weight=55.23f;

   public static void main(String[] args) {
        GrandFather.display1();
        Father father= new Father();
        father.show1();
        display2();
        father.show2();

   }

    public static void display2()
    {
        System.out.println("Father's height");
    }

    public void show2()
    {
        System.out.println("Father's weight");

    }
}
