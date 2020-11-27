package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_6064 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static char[][] map;
    static int max=0;
    static int tempvalue=0;
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++){
            st = new StringTokenizer(br.readLine());
            int M=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int max = M*N;
            long count=x;
            int index=0;

            if(y==N){
                y=0;
            }
            while(true){
                if((M*index+x)%N==y){
                    bw.write(M*index+x+"\n");
                    break;
                }
                if((M*index+x)>max){
                    bw.write(-1+"\n");
                    break;
                }
                index++;
            }
        }
        bw.flush();
        bw.close();
    }
}
