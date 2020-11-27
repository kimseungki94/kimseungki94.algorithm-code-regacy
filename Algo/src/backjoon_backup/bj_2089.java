package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_2089 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		dfs(N);
		sb.reverse();
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

	private static void dfs(int n) {
		
		if(n==0) {
			sb.append(0);
			return;
		}else if(n==1) {
			sb.append(n);
			return;
		}
		else{
			sb.append(Math.abs(n % -2));
			n = (int) Math.ceil(((double)n/-2));
			
			dfs(n);
		}
	}

}