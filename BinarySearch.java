import java.util.Arrays;
import java.io.*;

public class BinarySearch {

    // precondition: array a[] is sorted
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
       BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\Users\admin\Desktop\Java pr\samp.txt")));

        int[] whitelist = in.read();

        Arrays.sort(whitelist);

        // read key; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = in.readInt();
            if (rank(key, whitelist) == -1)
                System.out.println(key);

                 if(in!=null)
		           in.close();

        }
    }
}
