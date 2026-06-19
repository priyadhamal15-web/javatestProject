package methodStudy;

public class MethodReuse {
    static void main(String[] args) {
        MethodReuse methodReuse = new MethodReuse();
        methodReuse.add();
     methodReuse.add(1,5);
       methodReuse.add(5);
    }

    public void add() {
        int a = 10;
        int b = 100;
        int sum = a + b;
        System.out.println("My sum is " + sum);
    }

    public void add(int a, int b) {


        int sum = a + b;
        System.out.println("my Sum is "+sum);
    }
    public void add(int b){
        int sum = 10 + b;
        System.out.println("MY sum is "+sum);
    }
}