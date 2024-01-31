public class binary{
    public static void main(String[] args) {
        int a[] = {4, 5, 7, 8, 23, 24, 56};
        int key = 4;
        boolean flagValue = false;

        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (a[mid] == key) {
                System.out.println("Element found at index " + mid);
                flagValue = true;
                break;
            } else if (key > a[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        if (!flagValue) {
            System.out.println("Element is not found");
        }
    }
}
