
import java.io.*;
import java.util.*;

public class SolutionD {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            boolean isSorted = true;

            for (int k = 0; k < N - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    isSorted = false;
                    break;
                }
            }

            pw.println(isSorted ? "YES" : "NO");
        }

        pw.flush();
        br.close();
        pw.close();
    }
}
