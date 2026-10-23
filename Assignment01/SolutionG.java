
import java.io.*;
import java.util.*;

public class SolutionG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());
            int[] id = new int[N];
            int[] marks = new int[N];

            StringTokenizer stId = new StringTokenizer(br.readLine());
            StringTokenizer stMarks = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                id[j] = Integer.parseInt(stId.nextToken());
                marks[j] = Integer.parseInt(stMarks.nextToken());
            }

            int counter = 0;

            for (int j = 0; j < N - 1; j++) {

                int highest = j;

                for (int k = j + 1; k < N; k++) {

                    if (marks[k] > marks[highest]
                            || (marks[k] == marks[highest] && id[k] < id[highest])) {

                        highest = k;
                    }
                }

                if (highest != j) {

                    int temp1 = marks[j];
                    marks[j] = marks[highest];
                    marks[highest] = temp1;

                    int temp2 = id[j];
                    id[j] = id[highest];
                    id[highest] = temp2;

                    counter++;
                }
            }

            pw.println("Minimum swaps: " + counter);
            for (int m = 0; m < N; m++) {
                pw.println("ID: " + id[m] + " Mark: " + marks[m]);
            }

        }

        pw.flush();
        br.close();
        pw.close();
    }
}
