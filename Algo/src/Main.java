import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static int val5=0;
	static int val2=0;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		long N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());
		
		plusfactorial(N);
		minusfactorial(N-M);
		minusfactorial(M);
		if(val5>val2) {
			sb.append(val2+"\n");
		}else {
			sb.append(val5+"\n");
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
	private static void minusfactorial(long n) {
		long judge5=5;
		long judge2=2;
		while(n>=judge5) {
			val5-=n/judge5;
			judge5=judge5*5;
		}
		while(n>=judge2) {
			val2-=n/judge2;
			judge2=judge2*2;
		}
		
	}
	private static void plusfactorial(long n) {
		long judge5=5;
		long judge2=2;
		while(n>=judge5) {
			val5+=n/judge5;
			judge5=judge5*5;
		}
		while(n>=judge2) {
			val2+=n/judge2;
			judge2=judge2*2;
		}
	}
	
}