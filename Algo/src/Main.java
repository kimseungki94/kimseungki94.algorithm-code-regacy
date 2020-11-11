import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static long[] arr;
	static long[] visit;
	static String[] text;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		Stack<Long> stack = new Stack<>();
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new long[N];
		visit = new long[N];
		text = new String[N];
		st = new StringTokenizer(br.readLine());

		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<N;i++) {
			visit[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && visit[i]<visit[j]+1) {
					visit[i]=visit[j]+1;
				}
			}
		}
		long max=0;
		for(int i=0;i<N;i++) {
			max=Math.max(max,visit[i]);
		}
		
		sb.append(max+"\n");
		for(int i=N-1;i>=0;i--) {
			if(max==visit[i]) {
				stack.push(arr[i]);
				max--;
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop()+" ");
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}