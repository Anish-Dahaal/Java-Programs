package startpackage;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 2, 45);

        int res = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(res);

        // s3.forEach(n -> System.out.println(n));

        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        // System.out.println(sum);

    }
}
