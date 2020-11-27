package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class bj_13398 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] arr;
    static int[] dp,left,right;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        dp = new int[N];
        left = new int[N];
        right = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        left[0]=arr[0];
        int ans = arr[0];
        //left
        for(int i=1;i<N;i++){
            left[i]=Math.max(arr[i],left[i-1]+arr[i]);
            if(ans<left[i]){
                ans=left[i];
            }
        }
        right[N-1]=arr[N-1];
        //right
        for(int i=N-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]+arr[i]);
        }
        for(int i=1;i<N-1;i++){
            if(ans<left[i-1]+right[i+1]){
                ans=left[i-1]+right[i+1];
            }
        }

        bw.write(ans+"\n");
        bw.flush();
        bw.close();
    }
}