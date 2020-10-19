package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1772 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static int N;
	static int select;
	static long order = 0;
	static boolean[] visit;
	static long[] f = new long[21];
	static int[] arr;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		visit = new boolean[21];
		arr = new int[N];
		Arrays.fill(f, 1);
		st = new StringTokenizer(br.readLine());
		select = Integer.parseInt(st.nextToken());

		for (int i = 1; i < f.length; i++) {
			f[i] = factorial(1, i);
		}

		if (select == 1) {
			order = Long.parseLong(st.nextToken());
			dfs1();
		} else {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			dfs2();
		}
	}

	private static void dfs1() throws IOException {
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= N; j++) {
				if (visit[j] == true) {
					continue;
				}
				if (f[N - 1 - i] < order) {
					order = order - f[N - 1 - i];
				} else {
					arr[i] = j;
					visit[j] = true;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}
		bw.write("\n");
		bw.flush();
		bw.close();
	}

	private static void dfs2() throws IOException {
		order=1;
		for(int i=0;i<N;i++) {
			for(int j=1;j<arr[i];j++) {
				if(visit[j]==false) {
					order=order+f[N-1-i];
				}
			}
			visit[arr[i]]=true;
		}
		bw.write(order+"\n");
		bw.flush();
		bw.close();
	}

	private static long factorial(long data, int count) {
		if (count == 1 || count == 0) {
			return data;
		}
		data = data * count;
		return factorial(data, --count);
	}
}