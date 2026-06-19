package LogicalPrograms1;

import java.util.Scanner;

public class practice5 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");

        String name=scanner.next();
        System.out.println("My name is "+name);

        System.out.println("===================");

        System.out.println("please enter your  rollNumber ");
        int rollNumber=scanner.nextInt();
        System.out.println("My rollNumber is "+rollNumber);


        System.out.println("===================");


        System.out.println("please enter your marks");
        float marks=scanner.nextFloat();
        System.out.println("Marks is "+marks);
    }
}
