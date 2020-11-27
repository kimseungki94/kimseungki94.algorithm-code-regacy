package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_11576 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static boolean[] visit = new boolean[1000001];
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int before=Integer.parseInt(st.nextToken());
		int after = Integer.parseInt(st.nextToken());
		
		int count=0;
		st = new StringTokenizer(br.readLine());
		arr = new int[Integer.parseInt(st.nextToken())];
		
		st = new StringTokenizer(br.readLine());
		for(int i=arr.length-1;i>=0;i--) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=arr.length-1;i>=0;i--) {
				count+=Math.pow(before, i)*arr[i];
		}
		Stack<Integer> stack = new Stack<Integer>();
        while (count!=0){
            stack.add(count%after);
            count= count/after;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop() + " ");
        }
        bw.write(sb+"\n");
		bw.flush();
		bw.close();
	}

}