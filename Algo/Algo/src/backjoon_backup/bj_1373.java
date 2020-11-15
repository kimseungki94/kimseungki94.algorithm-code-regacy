package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class bj_1373 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		sb.append(st.nextToken());
		sb.reverse();
		char[] arr = sb.toString().toCharArray();
		sb.delete(0, sb.length());
		int index = (arr.length/3)+1;
		int[] result = new int[index];
		Arrays.fill(result, 0);
		int index_count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='1') {
				result[index_count]+=Integer.parseInt(String.valueOf(Math.round(Math.pow(2, (i%3)))));
			}
			if(i%3==2 || i==arr.length-1) {
				sb.append(result[index_count]);
				index_count++;
			}
		}
		bw.write(sb.reverse() + "\n");
		bw.flush();
		bw.close();
	}

}