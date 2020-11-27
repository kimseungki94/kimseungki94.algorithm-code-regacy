package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

class bj_2667 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[][] arr;
	static boolean[][] visit;
	static int[] directX = { 1, -1, 0, 0 };
	static int[] directY = { 0, 0, -1, 1 };
	static char[] temparr;
	static ArrayList<Integer> arraylist = new ArrayList<Integer>();
	static int count;
	static int N;

	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());

		arr = new int[N + 1][N + 1];
		visit = new boolean[N + 1][N + 1];
		init();
		build();

	}

	private static void init() throws IOException {
		String temp = "";
		for (int i = 1; i <= N; i++) {
			temp = br.readLine();
			temparr = temp.toCharArray();
			for (int j = 1; j <= N; j++) {
				arr[i][j] = temparr[j - 1] - '0';
			}
		}
	}

	private static void build() throws IOException {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (arr[i][j] == 1 && visit[i][j] == false) {
					count = 1;
					solve(i, j);
					arraylist.add(count);
				}
			}
		}
		Collections.sort(arraylist);
		bw.write(arraylist.size() + "\n");
		for (int i = 0; i < arraylist.size(); i++) {
			bw.write(arraylist.get(i) + "\n");
		}
		bw.flush();
		bw.close();
	}

	private static void solve(int x, int y) throws IOException {
		visit[x][y] = true;
		for (int k = 0; k < 4; k++) {
			int fx = x + directX[k];
			int fy = y + directY[k];
			if (fx >= 1 && fy >= 1 && fx <= N && fy <= N) {
				if (arr[fx][fy] == 1 && visit[fx][fy] == false) {
					solve(fx, fy);
					count++;
				}
			}
		}

	}

}