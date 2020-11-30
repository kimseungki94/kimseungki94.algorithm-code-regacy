package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_10971 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st = null;
    static int min=Integer.MAX_VALUE;
    static int[][] arr;
    static boolean[] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        visit = new boolean[N];

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<N;i++){
            dfs(i,i,0,0);
        }
        bw.write(min+"\n");
        bw.flush();
        bw.close();
    }

    private static void dfs(int start, int y, int sum, int count) {

        if(start==y && count==N){
            if(sum<min){
                min=sum;
            }
            return;
        }

        for(int x=0;x<N;x++){
            if(arr[y][x]==0){
                continue;
            }
            if(visit[y]==false && arr[y][x]>0){
                visit[y]=true;
                sum+=arr[y][x];
                if(sum<min){
                    dfs(start,x,sum,count+1);
                }
                visit[y]=false;
                sum-=arr[y][x];
            }
        }
    }


}
