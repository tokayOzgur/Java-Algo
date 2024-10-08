package october2024;

// bir dizinin a-z ye sıralı olup olmadığını hesaplayan program
public class Day7 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };

        System.out.println(isSortedAsc(arr1));
        System.out.println(isSortedAsc(arr2));

    }

    static boolean isSortedAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}
