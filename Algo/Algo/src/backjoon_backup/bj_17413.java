package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_17413 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Stack<Character> stack = new Stack<>();
		st = new StringTokenizer(br.readLine(),"");
		String word="";
		word=st.nextToken();
		char[] arr = word.toCharArray();
		int i=0;
		while(i<arr.length) {
			
			if(arr[i]=='<') {
				while(stack.size()!=0) {
					sb.append(stack.pop());
				}
				while(arr[i]!='>') {
					sb.append(arr[i]);
					i++;
				}
				sb.append(arr[i]);
			}else if(arr[i]==' ') {
				while(stack.size()!=0) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}
			else {
				stack.push(arr[i]);
			}			
			i++;
		}
		if(!stack.isEmpty()) {
			while(stack.size()!=0) {
				sb.append(stack.pop());
			}
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}