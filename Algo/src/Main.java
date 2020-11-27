import java.io.*;
import java.util.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[10];
        String near = "";
        if(M>0){
            st = new StringTokenizer(br.readLine());
        }
        for(int i=0;i<M;i++){
            arr[Integer.parseInt(st.nextToken())]=-1;
        }

        if(M==100){
            bw.write(0+"\n");
        }else{
            int min=Integer.MAX_VALUE;
            String v="";
            for(int i=0;i<=1000000;i++){
                boolean judge = true;
                v = i+"";
                for(int j=0;j<v.length();j++){
                    if(arr[v.charAt(j)-'0']==-1){
                        judge=false;
                        break;
                    }
                }
                if(judge){
                    if(min>Math.abs(N-Integer.parseInt(v))){
                        min=Math.abs(N-Integer.parseInt(v));
                        near = v;
                    }
                }
            }
            int result1 = Math.abs(N-100);
            if(near.equals("")){
                bw.write(result1+"\n");
            }else{
                int result2 = near.length()+Math.abs(N-Integer.parseInt(near));
                if(result1>result2){
                    bw.write(result2+"\n");
                }else{
                    bw.write(result1+"\n");
                }
            }
        }


        bw.flush();
        bw.close();
    }
}
