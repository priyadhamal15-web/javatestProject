package ConstructorChaining;

public class Y extends X {


    public Y()
        {

            System.out.println("User defined with non parameterized3 constructor in Y class");

        }

        public Y(int a)
        {
            super('h');
            System.out.println("with parametwrized");
            System.out.println(a);
        }
      public Y(String w)
        {

            System.out.println("User defined with parameterized4 constructor");
            System.out.println(w);
        }
    static void main(String[] args) {

        Y y = new Y();


    }
    }
