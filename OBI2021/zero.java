package OBI2021;

import java.util.Scanner;
import java.util.ArrayList;
public class zero {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total =0;
        int xi = 0;
        for (int i=0; i<n;i++) {
            Integer x = new Integer(0);
            xi = sc.nextInt();
            num.add(x);

        }
        for(int i = 0; i < num.size(); i++){
            if (xi == 0) {
                num.remove(num.size()-1);

            }
            total += num.get(i);
        }
        System.out.println(total);

    }

}