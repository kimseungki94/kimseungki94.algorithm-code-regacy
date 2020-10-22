package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_11655 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(),"");
		char[] a = st.nextToken().toCharArray();
		int plus=0;
		for(int i=0;i<a.length;i++) {
				if((int)a[i]>=65 && (int)a[i]<=90) {
					if((int)(a[i]+13)>90) {
						plus=(int)(a[i]+13)%90;
						sb.append((char)(64+plus));
					}else {
						sb.append((char)(a[i]+13));
					}
				}else if((int)a[i]>=97 && (int)a[i]<=122) {
					if((int)(a[i]+13)>122) {
						plus=(int)(a[i]+13)%122;
						sb.append((char)(96+plus));
					}else {
						sb.append((char)(a[i]+13));
					}
				}else if(a[i]==' '){
					sb.append(" ");
				}else {
					sb.append(a[i]);
				}
			}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}