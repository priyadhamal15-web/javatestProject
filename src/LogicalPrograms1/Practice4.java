package LogicalPrograms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Practice4 {
    static void main(String[] args) {
        int marks[]={12, 11, 54, 77, 90, 12, 54, 78, 98, 57, 60, 80};
        TreeSet<Integer> ts=new TreeSet<>();

        for(int m:marks)
        {
            ts.add(m);
        }
        System.out.println(ts);
                for(int t:ts)
                {
                    System.out.println(t);
                }
        ArrayList<Integer> ar1=new ArrayList<>(ts);
        System.out.println(ar1);

        System.out.println("Highest marks" + ar1.get(ar1.size()-1));

        System.out.println("2nd Highest " +ar1.get(ar1.size()-2));
        System.out.println("Lowest marks "+ ar1.get(0));
        System.out.println("2nd lowest "+ar1.get(1));
    }
}
