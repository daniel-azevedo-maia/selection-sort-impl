/**
 * Implementação do algoritmo Selection Sort, seguindo a abordagem clássica descrita no livro
 * "Introduction to Algorithms" (Cormen, Leiserson, Rivest, Stein).
 *
 * O Selection Sort funciona encontrando o menor elemento de um array e trocando-o com o primeiro elemento,
 * depois repetindo o processo para o restante do array até que esteja completamente ordenado.
 *
 * 📌 Complexidade:
 * - Melhor caso (array já ordenado): O(n²) (ainda há comparações, mas sem trocas)
 * - Caso médio: O(n²)
 * - Pior caso (array invertido): O(n²)
 *
 * 🛠 Complexidade espacial: O(1) (algoritmo **in-place**, pois não usa memória extra além de variáveis auxiliares)
 * 🚀 Não é um algoritmo estável (trocas podem alterar a ordem de elementos iguais)
 */

public class SelectionSort {

    /**
     * Ordena um array de inteiros usando o algoritmo Selection Sort.
     *
     * @param array O array a ser ordenado
     */
    public static void selectionSort(int[] array) {
        int tamanho = array.length;

        // Percorre todo o array
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMenor = i; // Assume que o menor elemento está na posição i

            // Busca o menor elemento na parte não ordenada
            for (int j = i + 1; j < tamanho; j++) {
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j; // Atualiza o índice do menor elemento encontrado
                }
            }

            // Troca o menor elemento encontrado com o primeiro elemento da parte não ordenada
            if (indiceMenor != i) {
                trocar(array, i, indiceMenor);
            }
        }
    }

    /**
     * Método auxiliar para trocar dois elementos de um array.
     *
     * @param array O array contendo os elementos
     * @param i Índice do primeiro elemento
     * @param j Índice do segundo elemento
     */
    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Método principal para testar a implementação do Selection Sort.
     */
    public static void main(String[] args) {
        int[] numeros = {1, 7, 5, 6, 3, 4, 2, 0};

        System.out.println("Array antes da ordenação:");
        imprimirArray(numeros);

        selectionSort(numeros);

        System.out.println("Array depois da ordenação:");
        imprimirArray(numeros);
    }

    /**
     * Método auxiliar para imprimir um array.
     *
     * @param array O array a ser impresso
     */
    private static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
