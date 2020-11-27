package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_2156 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] arr;
    static int[] dp;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        dp = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (N == 1) {
            sb.append(arr[0] + "\n");
        } else if (N == 2) {
            sb.append(arr[0] + arr[1] + "\n");
        } else {
            dp[0] = arr[0];
            dp[1] = dp[0] + arr[1];
            dp[2] = Math.max(dp[1], Math.max(arr[1] + arr[2], arr[0] + arr[2]));

            for (int i = 3; i < N; i++) {
                dp[i] = Math.max(dp[i - 3] + arr[i] + arr[i - 1], dp[i - 2] + arr[i]);
                dp[i] = Math.max(dp[i - 1], dp[i]);
            }
            sb.append(dp[N - 1] + "\n");
        }

        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}