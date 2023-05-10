import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        // Tworzymy mapę, w której będą przechowywane pary (wartość, indeks) dla każdego elementu tablicy
        Map<Integer, Integer> map = new HashMap<>();

        // Przechodzimy po wszystkich elementach tablicy nums
        for (int i = 0; i < nums.length; i++) {
            // Obliczamy wartość complement jako różnicę między wartością target a wartością bieżącego elementu
            int complement = target - nums[i];

            // Sprawdzamy, czy mapa zawiera wartość complement
            if (map.containsKey(complement)) {
                // Jeśli tak, zwracamy indeksy dwóch elementów, które sumują się do wartości target
                return new int[]{map.get(complement), i};
            }

            // Dodajemy do mapy parę (wartość, indeks) dla bieżącego elementu
            map.put(nums[i], i);
        }

        // Jeśli nie udało się znaleźć dwóch elementów sumujących się do wartości target, zgłaszamy wyjątek IllegalArgumentException
        throw new IllegalArgumentException("No two sum solution");
    }
}
