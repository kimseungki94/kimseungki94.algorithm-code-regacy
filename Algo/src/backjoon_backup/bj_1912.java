package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_1912 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static long[] arr;
	static long[] list;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new long[N];
		list = new long[N];
		
		
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Long.valueOf(st.nextToken());
		}
		list[0]=arr[0];
		for(int i=1;i<N;i++) {
			if(list[i-1]+arr[i]<arr[i]) {
				list[i]=arr[i];
			}else {
				list[i]=list[i-1]+arr[i];
			}
		}
		long max=list[0];
		for(int i=0;i<N;i++) {
			max=Math.max(max, list[i]);
		}
		bw.write(max+"\n");
		bw.flush();
		bw.close();
	}
}