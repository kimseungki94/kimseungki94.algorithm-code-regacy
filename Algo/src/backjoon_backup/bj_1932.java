package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_1932 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] arr;
    static int[][] dp;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N+1][N+1];
        dp = new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=i;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        if(N==1){
            dp[1][1]=arr[1][1];
            sb.append(dp[1][1]+"\n");
        }else if(N==2){
            dp[2][1]=arr[1][1]+arr[2][1];
            dp[2][2]=arr[1][1]+arr[2][2];
            sb.append(Math.max(dp[2][1],dp[2][2])+"\n");
        }else{
            dp[2][1]=arr[1][1]+arr[2][1];
            dp[2][2]=arr[1][1]+arr[2][2];
            for(int i=3;i<=N;i++){
                for(int j=1;j<=i;j++){
                    if(j!=1 && j!=i){
                        dp[i][j]=Math.max(dp[i-1][j-1],dp[i-1][j])+arr[i][j];
                    }else if(j==1){
                        dp[i][j]=dp[i-1][j]+arr[i][j];
                    }else{
                        dp[i][j]=dp[i-1][j-1]+arr[i][j];
                    }
                }
            }
            int max=0;
            for(int i=1;i<=N;i++){
                max=Math.max(dp[N][i],max);
            }
            sb.append(max+"\n");
        }
        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}