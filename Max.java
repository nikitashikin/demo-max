public class Max {
    public static void main(String[] args) {
        int nums[] = {1, -10, 5, 7, 9, 10, 12, 13, 15, 22};
        int max;
        max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("max: " + max);
    }
}