package controlStatement;

public class SwitchCaseStudy1 {
    static void main(String[] args) {
        //1st fruit Apple
        //2nd fruit Banana
        //3rd fruit Grapes

        String fruit="Banana";
        switch(fruit)
        {
            case "Apple": System.out.println("Apple");
            break;
            case "Banana": System.out.println("Banana");
            break;
            case "Grapes": System.out.println("Grapes");
            break;
            default:
                System.out.println("please enter valid fruit name");

        }
    }
}
