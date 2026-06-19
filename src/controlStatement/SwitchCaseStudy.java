package controlStatement;

public class SwitchCaseStudy {
    static void main(String[] args) {
        //1month--->Jan
        //2 month--->Feb
        //3 month--->March
        //4 month--->April
        int month=2;
        switch(month)
        {
            case 1:
            System.out.println("1St of month is Jan");
            break;
            case  2:
            System.out.println("2nd of month is Feb");
            break;
            case 3:
                    System.out.println("3rd of month is March");
            break;
            default:
                System.out.println("please enter valid Month");
        }
    }

}
