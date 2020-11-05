package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_1003 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] arr0;
	static int[] arr1;

	public static void main(String[] args) throws IOException {
		arr0 = new int[41];
		arr1 = new int[41];
		
		init();
		
		for(int i=3;i<=40;i++) {
			arr0[i]=arr0[i-1]+arr0[i-2];
			arr1[i]=arr1[i-1]+arr1[i-2];
		}
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int index=0;
		for(int t=0;t<N;t++) {
			st = new StringTokenizer(br.readLine());
			index = Integer.parseInt(st.nextToken());
			sb.append(arr0[index]+" "+arr1[index]+"\n");
		}
		
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
	}

	private static void init() {
		arr0[0]=1;
		arr1[0]=0;

		arr0[1]=0;
		arr1[1]=1;
		
		arr0[2]=1;
		arr1[2]=1;
		
	}

}