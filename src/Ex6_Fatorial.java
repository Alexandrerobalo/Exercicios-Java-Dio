import java.util.Scanner;

public class Ex6_Fatorial {
   /* Faça um programa que calcule o fatorial de um número interio pelo usuário.
   Ex 5!= 120 (5 x 4 x 3 x 2 x 1 )
    */

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Fatorial:");

        int fatorial = Scan.nextInt();
        int multiplicação = 1;

         for ( int i = fatorial   ;i>= 1 ; i = i -1  ){
             multiplicação = multiplicação * i;


         }
        System.out.println(multiplicação);




    }

}
