
import java.io.*;
import java.util.*;

public class SolutionE {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[][] pairs = new int[N * N][2];
        int count = 0;

        for (int i = 0; i < N; i += 2) {
            for (int j = 0; j + 2 < N; j += 2) {
                if (arr[j] > arr[j + 2]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                    pairs[count][0] = j + 1;
                    pairs[count][1] = j + 3;
                    count++;
                }
            }
        }

        for (int i = 1; i < N; i += 2) {
            for (int j = 1; j + 2 < N; j += 2) {
                if (arr[j] > arr[j + 2]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                    pairs[count][0] = j + 1;
                    pairs[count][1] = j + 3;
                    count++;
                }
            }
        }

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pw.println("NO");
                pw.flush();
                return;
            }
        }

        pw.println("YES");
        pw.println(count);
        for (int i = 0; i < count; i++) {
            pw.println(pairs[i][0] + " " + pairs[i][1]);
        }

        pw.flush();
        br.close();
        pw.close();
    }
}
