import java.util.Arrays;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] list = {14, 67, 48, 23, 5, 62};
        int N = 4;

        int nthLargest = findNthLargestNumber(list, N);

        System.out.println(N + "th Largest number: " + nthLargest);
    }

    public static int findNthLargestNumber(int[] list, int N) {
    
        Arrays.sort(list);
        return list[list.length - N];
    }
}
