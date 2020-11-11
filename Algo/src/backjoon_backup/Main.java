package backjoon_backup;
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
	static long[] arr;
	static long[] visit;
	static String[] text;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new long[N];
		visit = new long[N];
		text = new String[N];
		st = new StringTokenizer(br.readLine());

		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int find=0;
		for(int i=0;i<N;i++) {
			find=0;
			visit[i]=1;
			text[i]=String.valueOf(arr[i]);
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && visit[i]<visit[j]+1) {
					visit[i]=visit[j]+1;
					text[i]="";
					text[i]=text[j]+" "+arr[i];
					find=j;
				}
			}
		}
		long max=0;
		int result_index=0;
		for(int i=0;i<N;i++) {
			if(visit[i]>max) {
				max=visit[i];
				result_index=i;
			}
		}
		bw.write(max+"\n");
		bw.write(text[result_index]+"\n");
		bw.flush();
		bw.close();
	}
}