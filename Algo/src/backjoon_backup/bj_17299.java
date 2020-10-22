package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_17299 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int N=0;
	static int[] arr;
	static int[] answer;
	public static void main(String[] args) throws IOException {
		
		Stack<Integer> stack = new Stack<>();
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N];
		answer = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}			
		}
		stack.push(0);
		for(int i=1;i<N;i++) {
			while(!stack.isEmpty() && map.get(arr[stack.peek()])<map.get(arr[i])) {
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