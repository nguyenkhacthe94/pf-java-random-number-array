import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Enter array element: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nEnter any index: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Element value at index " + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index is out of array");
        }
    }
}
