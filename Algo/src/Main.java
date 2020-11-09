import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int[] arr;
	static int[] min;
	static int count=0;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr =new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		dp();
		bw.write(arr[N]+"\n");
		bw.flush();
		bw.close();
	}
	private static void dp() {
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				arr[i]=Math.min(arr[i], arr[j]+arr[i-j]);
			}
		}
	}
}