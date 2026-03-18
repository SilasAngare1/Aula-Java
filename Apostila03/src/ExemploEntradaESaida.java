import java.util.Scanner;

public class ExemploEntradaESaida {

    public static void main(String[] args) {
        //ler as notas do aluno e calcular a média FIAP
        Scanner leitor = new Scanner(System.in);

        //Declarar as variavies necessarias

        //variavel que lê palavras
        System.out.println("digite o nome do aluno:");
        String nome = leitor.next() +leitor.nextLine();


        System.out.println("digite a note da CP1:");
        double cp1 = leitor.nextDouble(); //le um valor do tipo double
        System.out.println("digite a nota da CP2:");
        double cp2 = leitor.nextDouble();
        System.out.println("digite a nota da GS:");
        double GS = leitor.nextDouble();
        System.out.println("digite a nota do challenge1:");
        double challenge1 = leitor.nextDouble();
        System.out.println("digite a nota do challenge2:");
        double challenge2 =leitor.nextDouble();

        double mediacp=((cp1+cp2)/2);
        double mediaCH = ((challenge1+challenge2)/2);

        double mediaFinal =(mediacp*0.2)+ (mediaCH*0.2)+ (GS*0.6);

        System.out.println("nome do aluno: "+ nome);
        System.out.println("media Final:"+ mediaFinal);

      }



}