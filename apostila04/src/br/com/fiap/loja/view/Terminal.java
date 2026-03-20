package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Categoria;
import br.com.fiap.loja.model.Produto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);


        System.out.println("digite o nome do produto:");
        String nome = leitor.nextLine();
        System.out.println("digite o preco:");
        double valor = leitor.nextDouble();
        System.out.println("digite a quantidade:");
        int quantidade = leitor.nextInt();
        System.out.println("diga se tem garantia (true or false):");
        boolean garantia = leitor.nextBoolean();

        System.out.println("qual a categoria");
        String descricao = leitor.next() + leitor.nextLine();
        System.out.println("qual o setor");
        String setor = leitor.next() + leitor.nextLine();


        Produto produto = new Produto();

        produto.nome = nome;
        produto.preco = valor;
        produto.quantidade = quantidade;
        produto.garantia = garantia;


        //Criar a categoria
        Categoria categoria = new Categoria();

        //Adcionar os valores nos atributos
        categoria.descricao = descricao;
        categoria.setor = setor;

        produto.categoria = categoria;

        //exibir os valores dos atributos
        System.out.println("Nome do produto" + produto.nome);
        System.out.println("Quantidade do produto" +produto.quantidade);
        System.out.println("Preço do produto" + produto.preco);
        System.out.println("Tem garantia?:" + produto.garantia);
        System.out.println("Descricao:" + categoria.descricao);
        System.out.println("Setor:"+ produto.categoria.setor);

    }




}