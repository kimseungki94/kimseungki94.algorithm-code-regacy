package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_9093 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static StringBuilder tempword = new StringBuilder();

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			String word = "";
			
			while(st.hasMoreTokens()) {
				word = st.nextToken();
				sb.append(tempword.append(word).reverse()+" ");
				tempword.delete(0, tempword.length());
			}
			sb.append("\n");
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
		
	}
}
