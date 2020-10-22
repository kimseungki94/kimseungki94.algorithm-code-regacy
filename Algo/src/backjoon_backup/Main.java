package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N=0;
	static int[] arr;
	static int[] answer;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		arr = new int[N];
		answer = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		stack.push(0);
		for(int i=1;i<arr.length;i++) {
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
				answer[stack.peek()]=arr[i];
				stack.pop();
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			answer[stack.peek()]=-1;
			stack.pop();
		}
		for(int i=0;i<answer.length;i++) {
			sb.append(answer[i]+" ");
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}
}