package codingbat_17;

import java.util.Arrays;
import java.util.Random;

public class CodingBat_17 {

    public static int[] nums() {
        Random rn = new Random();
        int[] nums = new int[rn.nextInt(20) + 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rn.nextInt(10) + 1;

        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int[] seriesUp(int x) {
        int[] seriesUp = new int[x * (x + 1) / 2];
        int start = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                seriesUp[start] = j + 1;
                start++;

            }
        }

        System.out.println(Arrays.toString(seriesUp));

        return seriesUp;

    }

    public static void main(String[] args) {
        seriesUp(6);
    }

}
