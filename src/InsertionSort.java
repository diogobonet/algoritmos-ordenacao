public class InsertionSort {
    public static int[] ordenar(int[] array) {
        System.out.print(" " + java.util.Arrays.toString(array));
        System.out.println(" -> Estado inicial");
        insertionSort(array);
        return array;
    }
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    trocar(array, j-1);
                    System.out.println(" " + java.util.Arrays.toString(array));
                }
            }
        }
    }

    private static void trocar(int[] array, int indice) {
        int temp;
        temp = array[indice+1];
        array[indice+1] = array[indice];
        array[indice] = temp;
    }
}
