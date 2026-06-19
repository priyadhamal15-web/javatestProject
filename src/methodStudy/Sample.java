package methodStudy;

public class Sample {
    public static void main(String[] args){
        d();

    }
    public void a()  //non static method declaration   --> this is complete method
    {
        //body -->definition
    }
        public void b() //non static method declaration   --> this is complete method
        {
            //body--> definition
            System.out.println("HI");
            System.out.println("HELLOW");
        }
        //public void c(); //method declaration   --> this is incomplete method

    public static void d()
    {
        System.out.println("hi");
    }
}
