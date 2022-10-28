import java.util.Scanner;

public class Ex5_Tabuada {
 /*Desenvolva um gerador de tabuada,
 capaz de gerar a tabuada de qualquer número
 inteiro  entre 1 a 10.
 O usúario deve informar de qual número ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo;

 tabuada do 5
 5 x 1 = 5
 5 x 2 = 10
 ...
 5 x 10 =50
  */

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("tabuada:");

        int tabuada = Scan.nextInt();

        System.out.println("Tabuada de:" + tabuada);

        for ( int i = 1 ; i <= 10 ; i = i +1 ){

            System.out.println(tabuada + "x" + i + "=" + (tabuada*i )    );

        }




    }


}
