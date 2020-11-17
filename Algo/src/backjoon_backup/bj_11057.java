package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_11057 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static long[][] arr;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            arr[1][i] = 1;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                for (int z = j; z < 10; z++) {
                    arr[i][j] =(arr[i][j]+ arr[i - 1][z])%10007;
                }
            }
        }
        long result = 0;

        for (int j = 0; j < 10; j++) {
            result = (arr[N][j]+result)%10007;
        }
        bw.write(result + "\n");
        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}