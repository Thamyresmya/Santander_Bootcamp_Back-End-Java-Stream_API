package Desafio;

import java.util.Arrays;
import java.util.List;


public class Desafio2 {

    /* Desafio 2 - Imprima a soma dos números pares da lista:
     * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o
     * resultado no console.
     */

    public static void main(String[] args) {
        // Criar uma lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List< Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        int resultado = numerosPares.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números pares é: " + resultado);

    }
}
