package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int Y = Integer.parseInt(st.nextToken());
		int count=0;
		boolean judge=true;
		for(int t=0;t<Y;t++) {			
			
			st = new StringTokenizer(br.readLine());
			
			String text = st.nextToken();
			char[] arr = new char[text.length()];
			
			L:for(int i=0;i<text.length();i++) {
				
				for(int z=0;z<text.length();z++) {
					if(text.charAt(i)==arr[z]) {
						judge=false;
						break L;
					}
				}
				if(i<text.length()-1) {
					if(text.charAt(i)!=text.charAt(i+1)) {
						arr[i]=text.charAt(i);
					}
				}		
			}
			
			if(judge) {
				count++;
			}
			judge=true;
		}
		
		bw.write(count+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
}