# Implementação do Selection Sort em Java

Este repositório contém a implementação do algoritmo de ordenação **Selection Sort** em Java.

## 📌 Sobre o Selection Sort

O **Selection Sort** é um algoritmo de ordenação simples, baseado na ideia de encontrar repetidamente o menor elemento da parte não ordenada do array e colocá-lo na posição correta. 

Ele opera dividindo o array em duas partes: a porção ordenada e a porção não ordenada. A cada iteração, ele seleciona o menor elemento da porção não ordenada e o move para a posição correta na porção ordenada.

## 🚀 Características do Algoritmo

- **In-place**: Não requer memória extra significativa além das variáveis auxiliares.
- **Não estável**: Trocas podem alterar a ordem relativa de elementos iguais.
- **Simples de entender e implementar**, mas não eficiente para grandes conjuntos de dados.

## 📊 Complexidade

| Caso         | Complexidade |
|-------------|-------------|
| Melhor caso (array já ordenado) | O(n²) |
| Caso médio  | O(n²) |
| Pior caso (array invertido) | O(n²) |
| Complexidade espacial | O(1) (in-place) |

O Selection Sort não é eficiente para grandes conjuntos de dados devido à sua complexidade quadrática. No entanto, é útil para pequenos arrays ou quando a simplicidade do código é uma prioridade.

## 🛠 Implementação

O código consiste nos seguintes métodos:

1. `selectionSort(int[] array)`: Implementa o algoritmo Selection Sort.
2. `trocar(int[] array, int i, int j)`: Método auxiliar para trocar dois elementos de posição.
3. `imprimirArray(int[] array)`: Exibe o array no console.
4. `main(String[] args)`: Método principal para testar a implementação.

## 📌 Código

```java
public class SelectionSort {

    public static void selectionSort(int[] array) {
        int tamanho = array.length;

        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (indiceMenor != i) {
                trocar(array, i, indiceMenor);
            }
        }
    }

    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 7, 5, 6, 3, 4, 2, 0};

        System.out.println("Array antes da ordenação:");
        imprimirArray(numeros);

        selectionSort(numeros);

        System.out.println("Array depois da ordenação:");
        imprimirArray(numeros);
    }

    private static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

## 💡 Explicação Passo a Passo

1. Percorremos o array do início ao penúltimo elemento.
2. Para cada posição `i`, encontramos o menor elemento na parte não ordenada.
3. Trocamos o menor elemento encontrado com o primeiro da parte não ordenada.
4. Repetimos o processo até o array estar completamente ordenado.

## 📈 Comparação com Outros Algoritmos

| Algoritmo       | Melhor Caso | Médio Caso | Pior Caso | Estável? | In-place? |
|----------------|------------|------------|------------|----------|----------|
| **Selection Sort** | O(n²) | O(n²) | O(n²) | ❌ Não | ✅ Sim |
| **Bubble Sort** | O(n) | O(n²) | O(n²) | ✅ Sim | ✅ Sim |
| **Insertion Sort** | O(n) | O(n²) | O(n²) | ✅ Sim | ✅ Sim |
| **Merge Sort** | O(n log n) | O(n log n) | O(n log n) | ✅ Sim | ❌ Não |
| **Quick Sort** | O(n log n) | O(n log n) | O(n²) | ❌ Não | ✅ Sim |

O Selection Sort é mais eficiente que o **Bubble Sort**, mas menos eficiente que o **Insertion Sort** para entradas parcialmente ordenadas. Para grandes conjuntos de dados, algoritmos como **Merge Sort** e **Quick Sort** são mais indicados.

## 📜 Licença

Este projeto está sob a licença MIT - sinta-se livre para usá-lo, modificá-lo e distribuí-lo conforme necessário.
