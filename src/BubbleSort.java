public class BubbleSort {
    public static int[] ordenar(int[] array) {
        System.out.print(" " + java.util.Arrays.toString(array));
        System.out.println(" -> Estado inicial");
        bubbleSort(array, array.length);
        return array;
    }

    private static void bubbleSort(int[] array, int ultimoIndice) {
        if (ultimoIndice > 1) {
            for (int i = 0; i < ultimoIndice-1; i++) {
                if (array[i] > array[i+1]) {
                    trocar(array, i);
                    System.out.println(" " + java.util.Arrays.toString(array));
                }
            }
            bubbleSort(array, ultimoIndice-1);
        }
    }

    private static void trocar(int[] array, int indice) {
        int temp;
        temp = array[indice+1];
        array[indice+1] = array[indice];
        array[indice] = temp;
    }
}
