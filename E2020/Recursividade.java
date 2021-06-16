package E2020;

import java.util.Scanner;

public class Recursividade {
    public static int fibronacci(int num){
        if (num == 0 || num == 1)
            return num;
        else
            return fibronacci(num-1)+fibronacci(num-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("fibronacci: "+ fibronacci(num));
    }
}
