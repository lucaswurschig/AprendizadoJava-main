package com.uno.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args){

        //Devo utilizar
        int idade = 20;
        String nome = "Lucas";
        String nomeDoMeuCachorro = "totó";
        String ano2014;

        //Posso utilizar mas não devo
        int _idade;
        int $idade;

        // Não e convensão Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;

        idade = 25;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        System.out.println("O nome do meu cachorro é: " + nomeDoMeuCachorro);

        //Ma pratica
        int a = 10;
        String b = "Lucas";
    }

}
