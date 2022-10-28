package Ex_MaiorEMedia;

import java.util.Scanner;

/*Faça um programa que leia 5 numeros
e informe o maior número
e a media desses números.
 */
public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int numero;

        int maior = 0;
        int soma = 0;
        int contador = 0;

        do {

            System.out.println("Numero:");
            numero = Scan.nextInt();

            soma = soma + numero;
            if (numero > maior) maior = numero;

            contador = contador + 1;


        }

        while (contador < 5 );
        System.out.println( "Maior: " + maior);
        System.out.println( "Média:" + ( soma /5));
    }

}
