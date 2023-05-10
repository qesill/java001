package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0; // licznik elementów, które nie są równe wartości val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // przesuwamy elementy, które nie są równe val na początek tablicy
                k++; // inkrementujemy licznik
            }
        }

        return k;
    }
}

