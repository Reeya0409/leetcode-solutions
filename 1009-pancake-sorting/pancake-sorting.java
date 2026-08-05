import java.util.*;
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int size = arr.length; size > 1; size--) {
            int maxIndex = 0;
            for (int i = 1; i < size; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            if (maxIndex == size - 1) {
                continue;
            }
            if (maxIndex != 0) {
                flip(arr, maxIndex + 1);
                result.add(maxIndex + 1);
            }
            flip(arr, size);
            result.add(size);
        }
        return result;
    }
    private void flip(int[] arr, int k) {
        int left = 0;
        int right = k - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

