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

class bj_10845 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int back = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			String word = st.nextToken();
			
			if(word.equals("push")) {
				back = Integer.parseInt(st.nextToken());
				queue.offer(back);
			}else if(word.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(queue.poll()+"\n");
				}
			}else if(word.equals("size")) {
				sb.append(queue.size()+"\n");
			}else if(word.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(word.equals("front")) {
				if(queue.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(queue.peek()+"\n");
				}
			}else if(word.equals("back")) {
				if(queue.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(back+"\n");
				}
			}else {
				continue;
			}
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
		
		

	}
}