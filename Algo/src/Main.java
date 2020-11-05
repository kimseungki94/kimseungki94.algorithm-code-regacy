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
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static boolean[] visit = new boolean[1000001];
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N+1];
		arr[0]=0;
		arr[1]=0;

		for(int i=2;i<=N;i++) {
			arr[i]=arr[i-1]+1;
			if(i%2==0 && arr[i/2]+1<arr[i]) {
				arr[i]=arr[i/2]+1;
			}
			if(i%3==0 && arr[i/3]+1<arr[i]) {
				arr[i]=arr[i/3]+1;
			}

		}
		bw.write(arr[N]+"\n");
        bw.flush();
		bw.close();
	}

}