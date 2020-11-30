package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_6603 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st = null;
    static int[] arr;
    static boolean[] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        while(true){
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            if(N==0){
                break;
            }
            arr = new int[N];
            visit = new boolean[N];
            for(int i=0;i<N;i++) {
                arr[i]=Integer.parseInt(st.nextToken());
            }
            dfs(0,0);
            sb.append("\n");

        }
        bw.write(sb+"\n");
        bw.flush();
        bw.close();
    }

    private static void dfs(int start, int count) {

        if(count==6){
            for(int i=0;i<N;i++){
                if(visit[i]==true){
                    sb.append(arr[i]+" ");
                }
            }
            sb.append("\n");
            return;
        }

        for(int i=start;i<N;i++){
            visit[i]=true;
            dfs(i+1,count+1);
            visit[i]=false;
        }
    }


}
