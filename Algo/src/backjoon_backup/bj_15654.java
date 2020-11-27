package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_15654 {
	static int[] arr;
	static int N,M;
	static boolean[] visit;
	static int[] list;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int max=0;
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		list = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<list.length;i++) {
			list[i]=Integer.parseInt(st.nextToken());
			if(max<list[i]) {
				max=list[i];
			}
		}
		Arrays.sort(list);
		visit = new boolean[max+1];
		dfs(0);
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

	private static void dfs(int count) throws IOException {
		if(count==M) {
			for(int val : arr) {
				//bw.write(val+" ");
				sb.append(val).append(" ");
			}
			//bw.write("\n");
			sb.append("\n");
			return;
		}
		for(int i=0;i<N;i++) {
			if(visit[list[i]]==false) {
				visit[list[i]]=true;
				arr[count]=list[i];
				dfs(count+1);
				visit[list[i]]=false;
			}
			
		}
		
	}
}