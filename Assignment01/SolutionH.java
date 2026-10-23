
import java.io.*;
import java.util.*;

class TrainDetail {

    String train;
    String destination;
    String departure;
    int index;

    TrainDetail(String train, String destination, String departure, int index) {
        this.train = train;
        this.destination = destination;
        this.departure = departure;
        this.index = index;
    }
}

public class SolutionH {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        TrainDetail[] Schedule = new TrainDetail[N];

        for (int i = 0; i < N; i++) {

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            String train = st.nextToken();
            st.nextToken();
            st.nextToken();
            st.nextToken();
            String destination = st.nextToken();
            st.nextToken();
            String time = st.nextToken();

            Schedule[i] = new TrainDetail(train, destination, time, i);

        }

        Arrays.sort(Schedule, (a, b) -> {
            int nameCompare = a.train.compareTo(b.train);
            if (nameCompare != 0) {
                return nameCompare;
            }
            int timeCompare = b.departure.compareTo(a.departure);
            if (timeCompare != 0) {
                return timeCompare;
            }
            return a.index - b.index;
        });

        for (int i = 0; i < N; i++) {
            pw.println(Schedule[i].train + " will departure for " + Schedule[i].destination + " at " + Schedule[i].departure);
        }

        pw.flush();
        br.close();
        pw.close();
    }
}
