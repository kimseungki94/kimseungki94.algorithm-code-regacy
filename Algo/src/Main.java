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
	static long N=0;
	static long M=0;
	static int[] arr;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Long.parseLong(st.nextToken());
		M = Long.parseLong(st.nextToken());
		
		if(N-M>0) {
			
		}else {
			
		}
		int value2=0;
		int value5=0;
		long temp=0;
		for(long i=N;i>=M;i--) {
			temp=i;
			while(temp%2==0) {
				value2++;
				temp=temp/2;
			}
			while(temp%5==0) {
				value5++;
				temp=temp/5;
			}
		}
		if(value2>0 && value5>0) {
			if(value2<value5) {
				sb.append(value2+"\n");
			}else {
				sb.append(value5+"\n");
			}
		}else {
			sb.append(0+"\n");
		}
		
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
	
}