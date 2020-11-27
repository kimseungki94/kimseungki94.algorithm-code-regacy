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

class bj_1978 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N=0;
	static int[] arr;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		//int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N];
		int max=0;
		
		int count=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			
			arr[i]=Integer.parseInt(st.nextToken());
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		visit = new boolean[max+1];
		visit[0]=true;
		visit[1]=true;
		
		for(int i=2;i*i<=max;i++) {
			for(int j=i*i;j<=max;j+=i) {
				visit[j]=true;
			}
		}
		for(int i=0;i<N;i++) {
			if(visit[arr[i]]==false) {
				count++;
			}
		}
		sb.append(count+"\n");
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

	
}