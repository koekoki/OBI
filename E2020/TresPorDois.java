package E2020;

public class TresPorDois {

    public static void main(String[] args) {

        int A=105, B=212, C=319;

        if ((B-A) < (C-B)){
            System.out.println(1);
        }
        else
            if ((B-A) > (C-B)){
                System.out.println(-1);
            }
            else
                if((B-A) ==(C-B)){
                    System.out.println(0);
                }
    }
}
