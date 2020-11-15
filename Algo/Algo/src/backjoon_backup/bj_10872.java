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

class bj_10872 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static long N=0;
	static int[] arr;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Long.parseLong(st.nextToken());
		dfs(N,1);
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
	private static void dfs(long count, long value) {
		if(count==0) {
			sb.append(value+"\n");
		}else {
			value=value*count;
			count--;
			dfs(count,value);
		}
		
	}
	

	
}