import java.util.Arrays;

class ArraySortingAndSearching {
    public static void main(String[] Args) {
        int[] src = {22, 3, 242, 3242, 42, 342, 42, 3424, 1341, 24, 24, 24, 2, 4242, 42, 42};
        Arrays.sort(src);
        System.out.println("Sorted array: " + Arrays.toString(src));

        int[] first3 = Arrays.copyOf(src, 3);
        System.out.println("First 3 numbers: " + Arrays.toString(first3));

        int midIndex = src.length / 2;
        int[] mid;
        if (src.length % 2 == 0) { //even number of elements
            mid = Arrays.copyOfRange(src, midIndex -1, midIndex + 1);
        } else { //odd number of elements
            mid = Arrays.copyOfRange(src, midIndex, midIndex + 1);
        }
        System.out.println("Middle number(s): " + Arrays.toString(mid));
    }
}
