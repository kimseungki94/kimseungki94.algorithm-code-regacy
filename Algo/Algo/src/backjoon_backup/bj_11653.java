package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_11653 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static boolean[] visit = new boolean[1000001];
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int index=2;
		if(N==1) {
		}else {
			while(true) {
				if(N==1) {
					break;
				}else {
					if(N%index==0) {
						N=N/index;
						sb.append(index+"\n");
					}else {
						index++;
					}
				}
			}
		}
		
        bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

}