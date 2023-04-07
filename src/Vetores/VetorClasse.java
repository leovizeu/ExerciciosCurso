package Vetores;

import Vetores.Entidades.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class VetorClasse {

    public static void main (String[] args){
        //O Locale serve para o leitor mudar de , para .
        //exemplo: 1.75
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Produtos[] vetor = new Produtos[N];

        for(int i=0; i<N; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Produtos(name, price);
        }

        double soma = 0.0;
        for(int i=0; i<N; i++){
            soma += vetor[i].getPrice();
        }
        double media= soma / N;
        System.out.printf("A média do Preço é: %.2f%n", media);

    }
}
