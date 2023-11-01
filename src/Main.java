import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 6, 5, 1, 7, 4};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        int[] array3 = Arrays.copyOf(array1, array1.length);

        System.out.println("\nMétodos de ordenação:");
        System.out.println("- Método: BUBBLE SORT");
        BubbleSort.ordenar(array1);

        System.out.println("\n- Método: INSERTION SORT");
        InsertionSort.ordenar(array2);

        System.out.println("\n- Método: QUICK SORT");
        QuickSort.ordenar(array3);
    }
}