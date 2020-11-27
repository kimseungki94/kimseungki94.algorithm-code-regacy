package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_10828 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String word = "";
		int number=0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			word=st.nextToken();
			if(word.equals("push")) {
				number= Integer.parseInt(st.nextToken());
				stack.push(number);
			}else if(word.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stack.pop()+"\n");
				}
			}else if(word.equals("size")) {
				sb.append(stack.size()+"\n");
			}else if(word.equals("empty")) {
				if(stack.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(word.equals("top")) {
				if(stack.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stack.peek()+"\n");
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