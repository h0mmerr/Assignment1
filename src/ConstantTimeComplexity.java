public class ConstantTimeComplexity {
    public static int findMaxConstant(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 10, 8, 5};
        int max = findMaxConstant(numbers);
        System.out.println("Max element: " + max);
    }
}
