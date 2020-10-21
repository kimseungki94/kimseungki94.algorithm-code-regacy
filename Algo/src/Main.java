import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
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
		int bar=0;
		int result=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='(') {
				stack.push('(');
				bar++;
			}
			if(i>0 && arr[i]==')' && arr[i-1]==')') {
				bar--;
				result=result+1;
				stack.pop();
			}else if(arr[i]==')' && stack.peek()=='(') {
				bar--;
				stack.pop();
				result+=bar;
			}
		}
		result =result+stack.size();
		bw.write(result+"\n");
		bw.flush();
		bw.close();
	}
}