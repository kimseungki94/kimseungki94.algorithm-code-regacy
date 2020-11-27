package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_10866 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Deque<Integer> deque = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String word= "";
		int M;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			word = st.nextToken();
			if(word.equals("push_front")) {
				M=Integer.parseInt(st.nextToken());
				deque.push(M);
			}else if(word.equals("push_back")) {
				M=Integer.parseInt(st.nextToken());
				deque.offer(M);
			}else if(word.equals("pop_front")) {
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(deque.pop()+"\n");
				}
			}else if(word.equals("pop_back")) {
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(deque.poll()+"\n");
				}
			}
			else if(word.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(word.equals("size")) {
				sb.append(deque.size()+"\n");
			}else if(word.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(-1+"\n");
				}
			}
			else if(word.equals("front")) {
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(deque.peek()+"\n");
				}
			}else if(word.equals("back")) {
				if(deque.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(deque.peekLast()+"\n");
				}
			}
		}
		
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}