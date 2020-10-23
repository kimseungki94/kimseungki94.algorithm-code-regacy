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

class bj_2609 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N=0;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(a<b) {
			int temp=b;
			b = a;
			a=temp;
		}
		int value = gcd(a,b);
		sb.append(value+"\n");
		sb.append((a*b)/value+"\n");
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			int c = a%b;
			return gcd(b,c);
		}
		
		
	}
	
}