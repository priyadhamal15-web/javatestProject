package Inheritance;

public class Son extends Mother {
    String nature = "pure";
    float weight = 55.56f;



    public static void main(String[] args) {

        Son son = new Son();
        son.method1();
        method2();

        show1();
        son.Show2();
        System.out.println(son.Color);
        System.out.println(son.height);


    }

        public static void show1() {
            System.out.println("Son's nature is pure");

        }
        public void Show2()
        {
            System.out.println("Son's weight is " +weight);
        }


    }




