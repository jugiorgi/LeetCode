public class BinarySearch {

    public static void main(String[] args) {
        double arr[] = new double[]{0, 1, 5, 6, 7, 8, 10, 11, 24};

        int position = search(arr, 0, arr.length - 1, 8);

        System.out.println("Target Position: " + position);
    }

    private static int search(double[] arr, int left, int right, double target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return search(arr, left, mid - 1, target);
            }

            return search(arr, mid + 1, right, target);
        }

        return -1;
    }
}
