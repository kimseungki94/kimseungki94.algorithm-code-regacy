package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_15988 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static long[] arr;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new long[1000001];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		for(int i=4;i<=1000000;i++) {
			arr[i]=(arr[i-3]+arr[i-2]+arr[i-1])%1000000009;
		}
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(arr[Integer.parseInt(st.nextToken())]+"\n");
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}