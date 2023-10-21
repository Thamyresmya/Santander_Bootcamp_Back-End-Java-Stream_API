package Desafio;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Desafio4 {
    /* Desafio 4 - Remova todos os valores ímpares:
     * Utilize a Stream API para remover os valores ímpares
     * da lista e imprima a lista resultante no console.
     */

    public static void main(String[] args) {
        // Criar uma lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List< Integer> numerosParesEZero = numeros.stream()
                .filter(n -> n % 2 == 0 || n == 0) // Filtra números pares e o zero
                .toList();

        System.out.println("Números pares e 0 da lista: " + numerosParesEZero);
    }
}
