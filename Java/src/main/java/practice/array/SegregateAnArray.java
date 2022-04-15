package practice.array;

// In the given array segregate the +ve, -ve and zero. First +ve numbers should be there, then -ve and then zeros.
public class SegregateAnArray {

    void segregateTheArray(int[] arr) {
        int lastPositiveIndex = -1;

        for (int i = 0, j = -1; i < arr.length; i++) {
            if (arr[i] <= 0) {
                if (j == -1)
                    j = i;
            }

            if (arr[i] > 0) {
                if (j != -1) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i = j;
                    j = -1;
                    lastPositiveIndex++;
                }
            }
        }

        for (int i = arr.length - 1, j = arr.length - 1; i > lastPositiveIndex; i--) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }

    public SegregateAnArray() {
        System.out.println("##############################");
        System.out.println("Segregate An Array");
        int arr[] = {3, 0, 4, -9, -6, 0, -4, 0, 4, -2, 6, 0, 5, 0, 9};
        segregateTheArray(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");

        System.out.println();
        System.out.println("##############################");


    }
}
