package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        Produto whey = new Produto();

        System.out.println("digite o nome do produto:");

        whey.nome = leitor.nextLine();






    }







}
