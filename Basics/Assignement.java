import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 2, 9, 4};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {4, 2, 7, 4, 9, 4};
        int target = 4;
        int first = -1, last = -1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == target) {
                if (first == -1) first = i;
                last = i;
            }
        }
        System.out.println(first + " " + last);

        int[] arr3 = {1, 2, 2, 3, 3, 3};
        Arrays.sort(arr3);
        int count = 1;
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] == arr3[i - 1]) {
                count++;
            } else {
                System.out.print(arr3[i - 1] + ":" + count + " ");
                count = 1;
            }
        }
        System.out.println(arr3[arr3.length - 1] + ":" + count);

        int[] arr4 = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr4.length / 2; i++) {
            int temp = arr4[i];
            arr4[i] = arr4[arr4.length - 1 - i];
            arr4[arr4.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {1, 2, 3, 4, 5};
        boolean isSorted = true;
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] < arr5[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);

        int[] arr6 = {1, 4, 6, 7, 8};
        int evenCount = 0;
        for (int num : arr6) {
            if (num % 2 == 0) evenCount++;
        }
        int[] evenArr = new int[evenCount];
        int index = 0;
        for (int num : arr6) {
            if (num % 2 == 0) evenArr[index++] = num;
        }
        System.out.println(Arrays.toString(evenArr));

        int[] arr7 = {10, 20, 4, 45, 99};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr7) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println(secondMax);

        int[] arr8 = {1, 3, 2, 3, 4, 1};
        Arrays.sort(arr8);
        for (int i = 1; i < arr8.length; i++) {
            if (arr8[i] == arr8[i - 1] && (i == 1 || arr8[i] != arr8[i - 2])) {
                System.out.print(arr8[i] + " ");
            }
        }
        System.out.println();

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) merged[k++] = a[i++];
            else merged[k++] = b[j++];
        }
        while (i < a.length) merged[k++] = a[i++];
        while (j < b.length) merged[k++] = b[j++];
        System.out.println(Arrays.toString(merged));

        int[] arr10 = {1, 3, 5, 7, 9};
        int searchTarget = 5;
        int low = 0, high = arr10.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr10[mid] == searchTarget) {
                result = mid;
                break;
            } else if (arr10[mid] < searchTarget) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(result);
    }
}
