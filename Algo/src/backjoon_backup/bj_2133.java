package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_2133 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] arr;
    static long[] dp;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        dp=new long[N+1];
        if(N==2){
            bw.write(3+"\n");
        }else if(N>=4 && N%2==0){
            dp[0]=1;
            dp[2]=3;
            for(int i=4;i<=N;i=i+2){
                dp[i]+=dp[2]*dp[i-2];
                for(int j=4;j<=i;j+=2){
                    dp[i]+=2*dp[i-j];
                }
            }
            bw.write(dp[N]+"\n");
        }else{
            bw.write(0+"\n");
        }

        bw.flush();
        bw.close();
    }
}