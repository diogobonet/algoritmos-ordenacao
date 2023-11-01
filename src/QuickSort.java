public class QuickSort {
    public static int[] ordenar(int[] array) {
        System.out.print(" " + java.util.Arrays.toString(array));
        System.out.println(" -> Estado inicial");
        quickSort(array, 0, array.length-1);
        System.out.println(" " + java.util.Arrays.toString(array));
        return array;
    }
    private static void quickSort(int[] array, int primeira_pos, int ultima_pos) {
        if (primeira_pos < ultima_pos) {
            int disponivel = primeira_pos;

            for (int i = primeira_pos; i < ultima_pos; i++) {
                if (array[i] < array[ultima_pos]) {  //array[ultima_pos] é o nosso pivot
                    trocar(array, i, disponivel);
                    disponivel++;
                    System.out.println(" " + java.util.Arrays.toString(array));
                }
            }
            trocar(array, ultima_pos, disponivel);
            System.out.println(" " + java.util.Arrays.toString(array));

            quickSort(array, primeira_pos, disponivel-1);
            quickSort(array, disponivel+1, ultima_pos);
        }
    }

    private static void trocar(int[] array, int i, int disponivel) {
        int temp = array[disponivel];
        array[disponivel] = array[i];
        array[i] = temp;
    }
}
