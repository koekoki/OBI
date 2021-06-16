package OBI2021;

import java.util.Scanner;

class cifra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        int qtd = p.length();
        int n=0, m=0;
        char v1 = 0, v=0;
        for(int i=0;i<qtd;i++){
            if (        'a' == p.charAt(i)
                    || 'e' == p.charAt(i)
                    || 'i' == p.charAt(i)
                    || 'o' == p.charAt(i)
                    || 'u' == p.charAt(i)){
                System.out.print(p.charAt(i));
            }
            else {
                if ('z' == p.charAt(i)) {
                    System.out.print(p.charAt(i));
                } else {
                    System.out.print(p.charAt(i));
                    for (char a = p.charAt(i); a <= 'z'; a++) {
                        n = n+1;
                        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                            v = a;
                            break;
                        }
                    }
                    for (char a = p.charAt(i); a >= 'a'; a--) {
                        m = m+1;
                        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                            v1 = a;
                            break;
                        }
                    }
                    if (m > n)
                        System.out.print(v1);
                    else
                        System.out.print(v);
               
                    for (char a = (char) (p.charAt(i)+1); a <= 'z'; a++) {
                        if (!(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'))
                        {
                            System.out.print(a);
                            break;
                        }
                    }
                }
            }
        }
    }
}
