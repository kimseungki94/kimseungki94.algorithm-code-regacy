import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] arr;
    static int[][] dp;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int T=0;
        T = Integer.parseInt(st.nextToken());

        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            arr = new int[2][N+1];
            dp = new int[2][N+1];
            for(int j=0;j<2;j++) {
                st = new StringTokenizer(br.readLine());
                for (int z = 1; z <= N; z++) {
                    arr[j][z] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][0]=0;
            dp[1][0]=0;
            dp[0][1]=arr[0][1];
            dp[1][1]=arr[1][1];

            for(int j=2;j<=N;j++){
                dp[0][j]=Math.max(dp[1][j-1],dp[1][j-2])+arr[0][j];
                dp[1][j]=Math.max(dp[0][j-1],dp[0][j-2])+arr[1][j];
            }
            sb.append(Math.max(dp[0][N],dp[1][N])+"\n");
        }

        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}