package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_16561 {
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int z = 0;
		for(int i=1;i<=2994;i++) {
			for(int j=1;j<=2994;j++) {
				z = N-i-j;
				if(z>2) {
					if(z%3==0 && i%3==0 && j%3==0) {
						count++;
					}
				}else {
					break;
				}
				
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}