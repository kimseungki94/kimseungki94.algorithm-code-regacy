package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class bj_17103 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static String[] arr;
	static boolean[] visit = new boolean[1000001];
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int index=0;
		int count=0;
		init();
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			index = Integer.parseInt(st.nextToken());
			count=0;
			for(int j=2;j<=index/2;j++) {
				if(visit[index-j]==false && visit[j]==false) {
					count++;
				}
			}
			bw.write(count+"\n");
		}
		bw.flush();
		bw.close();
	}

	private static void init() {
		
		for(int i=2;i<=1000000;i++) {
			if(visit[i]==false) {
				for(int j=i*2;j<=1000000;j+=i) {
					if(visit[j]==false) {
						visit[j]=true;
					}
				}
			}
			
		}
		
	}


}