import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        int n1 = input.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int n2 = input.nextInt();

        int ebob = 1,  k=1;
       int i=n1;
        while (i != 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("Ebob= " + ebob);
                break;
            } else{
                i--; }}

        int ekko=1;
            while (k != (n1 * n2)) {

                if(k%n1==0 && k%n2==0)
                {
                   ekko= k;

                    System.out.println("Ekok= "+ekko);
                    break;
                }
                else{
                k++; }

            }

        }
    }

