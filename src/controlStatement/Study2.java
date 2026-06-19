package controlStatement;

public class Study2 {
    static void main(String[] args) {
        //if marks 90 then you got distinction
        //if marks 80 then you got 1st class
        //if marks are 50 then you pass
        //if marks are 20 you fail
        int marks=80;
        if(marks<=50)
        {
            System.out.println("you got distinction");
        }
        else if(marks>=90){

            System.out.println("you got 1st class");
        }
        else if(marks!=80){
            System.out.println("you pass");
        }
        else
        {
            System.out.println("You fail");
        }
    }
}
