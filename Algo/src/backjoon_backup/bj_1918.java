package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_1918 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine()," ");
		Stack<Character> stack = new Stack<>();
		char[] arr = st.nextToken().toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=65 && arr[i]<=90) {
				sb.append(arr[i]);
			}else if(arr[i]=='(') {
				stack.add(arr[i]);
			}else if(arr[i]==')') {
				while(stack.peek()!='('){
					sb.append(stack.pop());
				}
				stack.pop();
			}else {
				while(!stack.isEmpty() && stack.peek()!='(' && !tohigher(stack.peek(),arr[i])) {
					char data = stack.pop();
					sb.append(data);
				}
				stack.push(arr[i]);
			}
		}
		while(!stack.isEmpty()) {
			if(stack.peek()!='(') {
				sb.append(stack.pop());
			}else {
				stack.pop();
			}
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

	private static boolean tohigher(Character data1, char data2) {
		boolean judge1 = false,judge2 = false;
		if(data1=='+' || data1=='-') {
			judge1=true;
		}
		if(data2=='*' || data2=='/') {
			judge2=true;
		}
		boolean judge = judge1&&judge2;
		return judge;
	}
}