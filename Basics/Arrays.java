// Arrays Basics in Java
// Arrays are a fundamental data structure in Java that allows us to store multiple values of the same type in a single variable.
// Arrays can be declared in two ways:
// 1. Declaration and initialization at the same time:
//    int[] numbers = {1, 2, 3, 4, 5};
// 2. Declaration and initialization separately:
//    int[] numbers;
//    numbers = new int[]{1, 2, 3, 4, 5};
//
class Arrays {

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        // Reverse the following array
        // int[] arr = {10, 40, 80, 90, 100, 20};
        int[] arr = {
            1,
            2,
            3,
            4,
            6,
            7,
            8,
            9,
            32,
            2346,
            24634,
            643,
            634,
            6,
            346,
            36,
            34,
            634634,
            6346,
            34,
            634,
            634,
            624,
            7246,
            246,
        };
        int[] reversedArr = reverseArray(arr);

        System.out.print("Reversed array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
