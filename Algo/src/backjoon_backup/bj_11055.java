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
    static int[] arr;
    static int[] dp;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        dp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            dp[i]=arr[i];
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[j]+arr[i],dp[i]);
                }
            }
        }
        int max=0;
        for(int i=0;i<N;i++){
            max=Math.max(dp[i],max);
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}