package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_2225 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N,K;
	static long[][] arr;
	static int[] dp;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new long[N+1][K+1];
		
		for(int i=1;i<=K;i++) {
			arr[0][i]=1;
			if(N>0) {
				arr[1][i]=i;
			}
		}
		for(int i=1;i<=N;i++) {
			arr[i][1]=1;
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=2;j<=K;j++) {
				for(int k=0;k<=i;k++) {
					arr[i][j]=(arr[i][j]+arr[i-k][j-1])%1000000000;
				}
				arr[i][j] = arr[i][j]%1000000000;
			}
		}
		
		bw.write(arr[N][K]+"\n");
		bw.flush();
		bw.close();
	}
}