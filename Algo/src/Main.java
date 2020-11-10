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
	static long[][] arr;
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new long[N+1][10];
			for(int i=1;i<=9;i++) {
				arr[1][i]=1;
			}
			for(int i=2;i<=N;i++) {
				for(int j=0;j<=9;j++) {
					if(j==0) {
						arr[i][j]=(arr[i-1][j+1])%1000000000;
					}else if(j==9) {
						arr[i][j]=(arr[i-1][j-1])%1000000000;
					}else {
						arr[i][j]=(arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
					}
				}
			}
		long value=0;
		for(int i=0;i<10;i++) {
			value+=arr[N][i];
		}
		bw.write(value%1000000000+"\n");
		bw.flush();
		bw.close();
	}
}