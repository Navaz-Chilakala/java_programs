
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Call the reverse method
        reverseArray(arr);

        // Print the reversed array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] arr) {
    	int start=0;
    	int end=arr.length-1;
    	while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
    	}
    }
}
