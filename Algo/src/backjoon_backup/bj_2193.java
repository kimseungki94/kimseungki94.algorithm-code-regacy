package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_2193 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static long[][] arr;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new long[N+1][2];
		arr[1][1]=1;
		if(N>=2) {
			arr[2][0]=1;
			
			for(int i=3;i<=N;i++) {
				arr[i][1]=arr[i-1][0];
				arr[i][0]=arr[i-1][1]+arr[i-1][0];
			}
			
		}
		bw.write(arr[N][1]+arr[N][0]+"\n");
		bw.flush();
		bw.close();
	}
}