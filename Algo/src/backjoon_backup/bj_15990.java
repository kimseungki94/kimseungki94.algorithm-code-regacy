package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_15990 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static long[][] arr;
	static int[] select;
	static int max=0;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		select = new int[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			select[i]=Integer.parseInt(st.nextToken());
			if(max<select[i]) {
				max=select[i];
			}
		}
		arr = new long[max+1][4];
		arr[1][1]=1;
		arr[2][2]=1;
		arr[3][1]=1;
		arr[3][2]=1;
		arr[3][3]=1;
		
		for(int i=4;i<=max;i++) {
			arr[i][1]=(arr[i-1][2]+arr[i-1][3])%1000000009;
			arr[i][2]=(arr[i-2][1]+arr[i-2][3])%1000000009;
			arr[i][3]=(arr[i-3][1]+arr[i-3][2])%1000000009;	
		}
		for(int i=0;i<N;i++) {
			sb.append((arr[select[i]][1]+arr[select[i]][2]+arr[select[i]][3])%1000000009+"\n");
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}