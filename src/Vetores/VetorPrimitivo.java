package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorPrimitivo {
    public static void main (String[] args){
        //O Locale serve para o leitor mudar de , para .
        //exemplo: 1.75
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] Vect = new double[N];

        for (int i=0; i<N; i++){
            Vect[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i=0; i<N; i++){
            soma += Vect[i];
        }

        double media = soma / N;

        System.out.printf("A média da soma é: %.2f%n", media);

        sc.close();
    }
}
