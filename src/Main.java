import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        int[] array3 = Arrays.copyOf(array1, array1.length);

        System.out.println("\nMétodos de ordenação:");
        System.out.println("- Método: BUBBLE SORT");
        BubbleSort.ordenar(array1);
    }
}