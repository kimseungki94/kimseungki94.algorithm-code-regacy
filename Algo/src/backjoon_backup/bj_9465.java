package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_9465 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] arr;
    static int[][] dp;
    static StringTokenizer st = null;

    /*
    효주 포도주 시식회 : 다양한 포도주 들어있는 포도주 잔이 일렬로 놓여있음
    포도주 시식 두가지 규칙

    */
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int T=0;
        T = Integer.parseInt(st.nextToken());


        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}