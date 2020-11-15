package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class bj_1463_topDown {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] d;
	static boolean[] visit = new boolean[1000001];
	static int value = 0;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		d = new int[N + 1];
		bw.write(dp(N) + "\n");
		bw.flush();
		bw.close();
	}

	private static int dp(int n) {
		if (n == 1) {
			return 0;
		}
		if (d[n] > 0) {
			return d[n];
		}
		//d[n] = dp(n - 1) + 1;
		if (n % 2 == 0) {
			int tmp = dp(n / 2) + 1;
			if (d[n] > tmp)
				d[n] = tmp;
		}
		if (n % 3 == 0) {
			int tmp = dp(n / 3) + 1;
			if (d[n] > tmp)
				d[n] = tmp;
		}
		if(dp(n-1)+1<d[n]) {
			d[n]=dp(n-1)+1;
		}
		return d[n];
	}
}
