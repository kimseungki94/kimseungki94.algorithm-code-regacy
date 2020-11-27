package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_6588 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N=0;
	static int[] arr;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int value=0;
		
		int max=1000000;
		visit = new boolean[1000001];
		visit[0]=true;
		visit[1]=true;
		visit[2]=true;
		for(int i=2;i*i<=max;i++) {
			for(int j=i*i;j<=max;j+=i) {
				visit[j]=true;
			}
		}
		while(true) {
			value=Integer.parseInt(st.nextToken());
			if(value==0) {
				break;
			}
			int i=3;
			while(true) {
				if(!visit[i]&&!visit[value-i]) {
					sb.append(value+" = "+i +" + "+(value-i)+"\n");
					break;
				}else if(value-i==0) {
					sb.delete(0, sb.length());
					sb.append("Goldbach's conjecture is wrong."+"\n");
					break;
				}
				i++;
			}
			st = new StringTokenizer(br.readLine());
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

	
}