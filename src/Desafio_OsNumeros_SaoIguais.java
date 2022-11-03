import java.util.Scanner;

public class Desafio_OsNumeros_SaoIguais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        {
            int A = 15;
            int B = 15;
            System.out.println("Digite a primeira nota:");
            A = scan.nextInt();

            System.out.println("Digite a segunda nota:");
            B = scan.nextInt();

            if ((A - B) == 0)

            System.out.println("Os números são iguais");
            else
            System.out.println("Os números são diferentes");

        }




    }







}




