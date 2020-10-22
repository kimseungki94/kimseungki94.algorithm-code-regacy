package backjoon_backup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class bj_1935 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static DecimalFormat form = new DecimalFormat("0.00");

	public static void main(String[] args) throws IOException {
		Stack<Double> stack = new Stack<>();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(),"");
		double result=0;
		char[] arr = st.nextToken().toCharArray();
		String[] data = new String[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			data[i]=st.nextToken();
		}
		
		ArrayList<String> arraylist = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if((int)arr[i]>=65 && (int)arr[i]<=90) {
				arraylist.add(data[(int)arr[i]-65]);
			}else {
				arraylist.add(Character.toString(arr[i]));
			}
		}
		int i=0;
		if(arraylist.size()>1) {
			while(i<arr.length) {
				if(arraylist.get(i).equals("*")) {
					result=Double.parseDouble(form.format(stack.pop()*stack.pop()));
					stack.push(result);
				}else if(arraylist.get(i).equals("+")) {
					result=(stack.pop()+stack.pop());
					stack.push(result);
				}else if(arraylist.get(i).equals("-")) {
					double data1 = (double)stack.pop();
					double data2 = (double)stack.pop();
					result=(double)(data2-data1);
					stack.push(result);
				}else if(arraylist.get(i).equals("/")) {
					double data1 = (double)stack.pop();
					double data2 = (double)stack.pop();
					result=Double.parseDouble(form.format(data2/data1));
					stack.push(result);
				}else {
					stack.push(Double.parseDouble(arraylist.get(i)));
				}
				i++;
			}
			bw.write(form.format(result)+"\n");
		}else {
			bw.write(arraylist.get(0));
		}
		
		bw.flush();
		bw.close();
	}
}