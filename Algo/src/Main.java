import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static long[][] dp;
    static long[][] arr;

    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        dp=new long[N][3];
        arr=new long[N][3];
        long ans=10000001;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int T=0;T<3;T++){
            for(int K=0;K<3;K++){
                if(K==T){
                    dp[0][K]=arr[0][K];
                }else{
                    dp[0][K]=10000001;
                }
            }
            for(int i=1;i<N;i++){
                dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+arr[i][0];
                dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+arr[i][1];
                dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1])+arr[i][2];
            }
            for(int i=0;i<3;i++){
                if(i!=T){
                  ans=Math.min(ans,dp[N-1][i]);
                }
            }
        }
        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}