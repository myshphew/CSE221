import java.io.*;

public class SolutionC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            long sum = (long) N * (N + 1) / 2;;
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
    }
}