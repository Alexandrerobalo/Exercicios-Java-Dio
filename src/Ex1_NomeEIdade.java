import java.util.Scanner;
   /*
 faça um ptograma que leia conjuntos de dois valores,
         o primeiro representado onome do aluno
e o segundo representado sua idade.
         ( pare o programa inserindo o valor 0 no campo nome)/*

    */

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       String nome;
       int idade;


        while (true) {

            System.out.println("Nome");
            nome = scan.next();

            if (nome.equals("0"))break;
            System.out.println("Idade");
            idade = scan.nextInt();

        }


         System.out.println("continua aqui");
    }
}