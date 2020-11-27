package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_11005 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static String[] arr;
	static boolean[] visit = new boolean[1000001];
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		if(N==0) {
			sb.append(0);
		}else {
			while(true) {
				if(Math.abs(N%M)>=10) {
					sb.append((char)(65+Math.abs(N%M)-10));
				}else {
					sb.append(Math.abs(N%M));
				}
				N=N/M;
				if(N==0) {
					break;
				}
			}
			if(N!=0) {
				sb.append(N);
			}
			
			
		}
		sb.reverse();
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

}