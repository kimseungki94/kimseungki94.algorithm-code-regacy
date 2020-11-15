package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int temp = 0;
		int cycle = 0;
		
		if (N < 10) {
			temp = N * 10 + N;
		} else {
			int i = N / 10;
			int j = N % 10;
			temp = i+j;
			temp = j*10+temp%10;
		}
		cycle=1;
		if(temp==N) {
		}else {
			L: while (true) {
				if (N == temp) {
					break L;
				} else {
					if (temp < 10) {
						temp = temp * 10 + temp;
					} else {
						int i = temp / 10;
						int j = temp % 10;
						temp = i+j;
						temp = j*10+temp%10;
					}
					cycle++;
				}
			}
		}
		bw.write(cycle+"\n");
		
		bw.flush();
		bw.close();
	}
}