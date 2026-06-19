package Inheritance;

public class Child2 extends SuperDad {

    static void main(String[] args) {
        SuperDad superDad = new SuperDad();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        superDad.car();
        child1.bike();
        child1.height();
        Child1.laptop();


        System.out.println("===============");
        child2.car();
        child2.height();
        child2.nature();
        home();


        System.out.println("=======================");
        System.out.println(child1.Height);
        System.out.println(child2.car);
        System.out.println(child1.car);
        System.out.println(child2.Height);

    }

        public static void home()
        {
            System.out.println("child2 home is ");
        }
        public void nature()
        {
            System.out.println(" Child2 nature is");
        }
    }
