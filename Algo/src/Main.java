import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int result=1;
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = null;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			factorial(N);
			bw.write(result+"\n");
			bw.flush();
			bw.close();
	    }

	public static void factorial(int n) {
		if(n==1  || n==0) {
			return;
		}else {
			result*=n;
			n--;
			factorial(n);
		}
		
	}
}