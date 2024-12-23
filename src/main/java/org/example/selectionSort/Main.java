package org.example.selectionSort;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 100);
        }
        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        //Selection sort
        int posicao_menor, auxiliar;
        for (int i = 0; i < vetor.length; i++){
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            auxiliar = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = auxiliar;
        }

        System.out.println("\n\nOrdenado");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
