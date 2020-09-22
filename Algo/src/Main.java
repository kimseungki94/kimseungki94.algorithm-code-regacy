import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int count = 0;
	static boolean[] visited;
	static int[] arr;
	static int turn;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int choice = Integer.parseInt(st.nextToken());
		
		if(choice==1) {
			turn=Integer.parseInt(st.nextToken());
			visited = new boolean[N];
			permutation1(turn,visited);
		}else {
			arr = new int[N];
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			permutation2(arr);
		}
		
			
		bw.flush();
		bw.close();
	}
	private static void permutation1(int turn, boolean[] visited) {
		
		for(int i=0;i<N;i++) {
			if(visited[i]==true) {
				continue;
			}
			System.out.println(arr[i]);
			visited[i]=true;
		}
		
	}
	
	private static void permutation2(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	
}