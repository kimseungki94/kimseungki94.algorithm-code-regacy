package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_17087 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long S = Integer.parseInt(st.nextToken());
		long[] brother = new long[N];
		st = new StringTokenizer(br.readLine());
		long data = 0;
		long result = 0;
		for (int i = 0; i < N; i++) {
			data = Long.parseLong(st.nextToken());
			if (data < S) {
				data = S - data;
			} else {
				data = data - S;
			}
			brother[i] = data;
		}

		result = brother[0];
		if (N > 1) {
			for (int i = 1; i < N; i++) {
				result = gcd(result, brother[i]);
			}
		}
		sb.append(result + "\n");
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
	}

	private static long gcd(long a, long b) {

		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

}