package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_9012 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Stack<String> stack = null;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int t=0;t<N;t++) {
			stack = new Stack<>();
			boolean judge = false;
			st = new StringTokenizer(br.readLine());
			char[] arr = st.nextToken().toCharArray();
			for(int i=0;i<arr.length;i++) {
				if(arr[i]=='(') {
					stack.push("(");
				}else {
					if(stack.isEmpty()) {
						judge=true;
						sb.append("NO"+"\n");
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(judge==true) {
				continue;
			}
			else if(stack.isEmpty()) {
				sb.append("YES"+"\n");
			}
			else{
				sb.append("NO"+"\n");
			}
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}