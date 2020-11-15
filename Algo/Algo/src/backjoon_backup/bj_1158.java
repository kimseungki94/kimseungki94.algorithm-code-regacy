package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_1158 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
			arraylist.add(i, i+1);
		}
		int M = Integer.parseInt(st.nextToken());
		int count = 0;
		while(arraylist.size()!=0) {
			count = (count+M-1)%arraylist.size();
			queue.offer(arraylist.get(count));
			arraylist.remove(count);
		}
		sb.append("<");
		for(int i=0;i<N-1;i++) {
			sb.append(queue.poll()+", ");
		}
		sb.append(queue.poll());
		sb.append(">");
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}