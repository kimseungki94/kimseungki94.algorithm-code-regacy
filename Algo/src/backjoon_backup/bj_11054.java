package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_11054 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] arr;
    static int[] dp,dp1,dp2;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        dp = new int[N];
        dp1 = new int[N];
        dp2 = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp1[0]=1;
        //증가하는부분
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp1[i]=Math.max(dp1[j],dp1[i]);
                }
            }
            dp1[i]++;
        }
        dp2[N-1]=1;
        //감소하는부분
        for(int i=N-2;i>=0;i--){
            for(int j=N-1;j>i;j--){
                if(arr[i]>arr[j]){
                    dp2[i]=Math.max(dp2[j],dp2[i]);
                }
            }
            dp2[i]++;
        }
        for(int i=0;i<N;i++){
            dp[i]=dp1[i]+dp2[i]-1;
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(dp[i], max);
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}