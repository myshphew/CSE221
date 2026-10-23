
import java.io.*;
import java.util.*;

public class SolutionF {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {

                boolean isSwappable = (arr[j] % 2 == 0 && arr[j + 1] % 2 == 0) || (arr[j] % 2 != 0 && arr[j + 1] % 2 != 0);

                if ((arr[j] > arr[j + 1]) && isSwappable) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            pw.print(arr[i] + " ");
        }
        pw.println();

        pw.flush();
        br.close();
        pw.close();
    }
}
