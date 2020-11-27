package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_1748 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static char[][] map;
    static int max=0;
    static int tempvalue=0;
    static StringTokenizer st = null;
    static long sum=0;

    static long base=10;
    static int value=1;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++){
            if(base<=i){
                base=base*10;
                ++value;
                sum+=value;
            }else{
                sum+=value;
            }
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }


}