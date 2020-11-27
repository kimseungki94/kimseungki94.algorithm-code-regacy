package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_10824 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine()," ");
		String[] arr = new String[4];
		for(int i=0;i<arr.length;i++) {
			arr[i]=st.nextToken();
		}
		String data1 = arr[0]+arr[1];
		String data2 = arr[2]+arr[3];
		Long result = Long.parseLong(data1)+Long.parseLong(data2);
		bw.write(result+"\n");
		bw.flush();
		bw.close();
	}
}