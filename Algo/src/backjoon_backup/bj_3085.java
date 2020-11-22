package backjoon_backup;

import java.io.*;
import java.util.StringTokenizer;

class bj_3085 {
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
        N = Integer.parseInt(st.nextToken());

        map = new char[N][N];
        for(int i=0;i<N;i++){
            String input = br.readLine();
            for(int j=0;j<N;j++){
                map[i][j]=input.charAt(j);
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j!=N-1){
                    rightChange(i,j);
                    judge();
                    rightChange(i,j);
                }
                if(i!=N-1){
                    belowChange(i,j);
                    judge();

                    belowChange(i,j);
                }

            }
        }
        bw.write(max+"\n");
        bw.flush();
        bw.close();
    }
    private static void rightChange(int x,int y) {
        char temp;
        temp=map[x][y];
        map[x][y]=map[x][y+1];
        map[x][y+1]=temp;
    }

    private static void belowChange(int x,int y) {
        char temp;
        temp=map[x][y];
        map[x][y]=map[x+1][y];
        map[x+1][y]=temp;
    }

    private static void judge() {

        for(int i=0;i<N;i++){
            int judge=1;
            for(int j=1;j<N;j++){
                if(map[i][j]==map[i][j-1]){
                    judge+=1;
                }else{
                    max=Math.max(judge,max);
                    judge=1;
                }
            }
            max=Math.max(judge,max);
        }

        for(int i=0;i<N;i++){
            int judge=1;
            for(int j=1;j<N;j++){
                if(map[j][i]==map[j-1][i]){
                    judge+=1;
                }else{
                    max=Math.max(judge,max);
                    judge=1;
                }
            }
            max=Math.max(judge,max);
        }
    }



}