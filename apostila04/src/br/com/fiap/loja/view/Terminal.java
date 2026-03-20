package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        Produto whey = new Produto();

        System.out.println("digite o nome do produto:");
        whey.nome = leitor.nextLine();
        System.out.println("digite o preco:");
        whey.preco = leitor.nextDouble();
        System.out.println("digite a quantidade:");
        whey.quantidade = leitor.nextInt();
        System.out.println("diga se tem garantia (true or false):");
        whey.garantia = leitor.nextBoolean();
        System.out.println("digite o tipo do whey");
        whey.tipo = leitor.nextLine();

        whey.preco *= whey.quantidade;

        System.out.println(whey.nome);
        System.out.println(whey.quantidade);
        System.out.println(whey.preco);
        System.out.println(whey.garantia);
        System.out.println(whey.tipo);


    }




}