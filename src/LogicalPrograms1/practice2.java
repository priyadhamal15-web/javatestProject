package LogicalPrograms1;

public class practice2 {
    static void main(String[] args) {
        String s="  Pri yan ka  ";

        int count=0;

        for(int i=0;i<=s.length()-1; i++)
        {
            char temp=s.charAt(i);
            if(temp==' ')
                {
                    count++;

                }
            }
        System.out.println("Number of space count is "+count);
        }
    }
