
import java.io.*;
import java.util.*;

public class SolutionB {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            long a = Long.parseLong(st.nextToken());
            String operation = st.nextToken();
            long b = Long.parseLong(st.nextToken());

            switch (operation) {
                case "+":
                    pw.println(a + b);
                    break;
                case "-":
                    pw.println(a - b);
                    break;
                case "*":
                    pw.println(a * b);
                    break;
                case "/":
                    pw.printf("%.10f%n", (double) a / b);
                    break;
                case "%":
                    pw.println(a % b);
                    break;
                case "&":
                    pw.println(a & b);
                    break;
                case "|":
                    pw.println(a | b);
                    break;
                case "^":
                    pw.println(a ^ b);
                    break;
                case "<<":
                    pw.println(a << b);
                    break;
                case ">>":
                    pw.println(a >> b);
                    break;
            }
        }

        pw.flush();
        br.close();
        pw.close();
    }
}
