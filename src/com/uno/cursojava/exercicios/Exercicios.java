package com.uno.cursojava.exercicios;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //Exercicio 1
        System.out.println("Alo Mundo");

        //Exercicio 2
        int pedirNumero = scan.nextInt();
        System.out.println("O numero informado foi: " + pedirNumero);

        //Exercicio 3
        int numero1 = 10;
        int numero2 = 20;
        int somaNumeros = numero1 + numero2;
        System.out.println("A Soma de ambos e equivalente a: " + somaNumeros);

        //Exercicios 4
        int notaMatematica = 8;
        int notaCiencias = 9;
        int notaHistoria = 3;
        int notaGeografia = 2;
        double media = (notaGeografia + notaCiencias + notaHistoria + notaGeografia) /4;
        System.out.println("A media do aluno e: " + media);

        //Exercicio 5
        int quantosMetros = scan.nextInt();
        double centimetros = (quantosMetros/0.01);
        System.out.println("Quantos centimetros tem essa quantidade de metros: " + centimetros + "cm");

        //Exercicio 6
        double pi = 3.14159265359;
        double circunferencia = 30;
        double raio = (pi * 2) / circunferencia;
        System.out.println("O calculo da area e de: " + raio);

        //Exercicio 7
        int larguraQuadrado = 5;
        int alturaQuadrado = 10;
        int areaQuadrado = larguraQuadrado * 2 + alturaQuadrado * 2;
        int dobroArea = areaQuadrado * 2;
        System.out.println("O Dobro da area e: " + dobroArea);

        //Ecercicio 8
        double hora = 13.15;
        double horasSemanais = 40;
        double horasMensais = horasSemanais * 4;
        double valorHora = hora * horasMensais;
        System.out.println("Voce ganha por mes: " + valorHora);

        //Exercicio 9
        double tempFar = scan.nextDouble();
        double tempCel = (5 * (tempFar-32) / 9);
        System.out.println("Aqui a temperatura e de: " + tempCel +"C");

        //Exercicio 10
        double temperatCel = 10;
        double temperatFar = ((temperatCel * 9/5) + 32);
        System.out.println(" Aqui a temperatura e de:" + temperatFar + "F");

        //Exercicio 11
        int num1 = 10;
        int num2 = 20;
        double num3 = 5.5;
        double a = (num1 *2)+(num2 /2);
        double b = (num1 *3)+ num3;
        double c = Math.pow(5.5, 3);
        System.out.println("Resultado a:" + a);
        System.out.println("Resultado b:" + b);
        System.out.println("Resultado v:" + c);

        //Exercicio 12
        double altura = 1.79;
        double peso = ((72.7*altura)-58);
        System.out.println("O seu peso ideal e: " + peso);

        //Exercicio 13
        double h = 1.70;
        double pesoHomem = ((72.7*h)-58);
        double pesoMulher = ((62.1*h)-44.7);
        System.out.println("Se for homem o peso ideal para sua altura e: " + pesoHomem);
        System.out.println("Se for mulher o peso ideal para sua altura e: " + pesoMulher);

    }

}
