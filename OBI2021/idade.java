import java.util.Scanner;

class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte c1, c2, c3;
        c1 = sc.nextByte();
        c2 = sc.nextByte();
        c3 = sc.nextByte();

        if (c1 >= c2 && c1 <= c3)
            System.out.println(c1);
        else
        if (c2 >= c1 && c2 <= c3)
            System.out.println(c2);
        else
            if (c3 >= c2 && c3 <= c1)
            System.out.println(c3);
            else
            if (c1 >= c3 && c1 <= c2)
                System.out.println(c1);
            else
            if (c2 >= c3 && c2 <= c1)
                System.out.println(c2);
            else
            if (c3 >= c1 && c3 <= c2)
                System.out.println(c3);
    }
}
