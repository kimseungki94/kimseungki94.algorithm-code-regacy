package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		
		if(i>j && i>z) {
			if(j>=z) {
				bw.write(j+"\n");
			}else {
				bw.write(z+"\n");
			}
		}else if(i==j && i==z) {
			bw.write(i+"\n");
		}else if(j>i && j>z) {
			if(i>=z) {
				bw.write(i+"\n");
			}else {
				bw.write(z+"\n");
			}
		}else if(z>i && z>j) {
			if(i>=j) {
				bw.write(i+"\n");
			}else {
				bw.write(j+"\n");
			}
		}else if(i==j) {
			bw.write(j+"\n");
		}else if(j==z) {
			bw.write(j+"\n");
		}else if(i==z) {
			bw.write(i+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
