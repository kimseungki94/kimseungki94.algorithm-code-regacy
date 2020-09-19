package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int Y = Integer.parseInt(st.nextToken());
		
		for(int t=0 ; t<Y;t++) {
			
			st = new StringTokenizer(br.readLine());
			
			int T = Integer.parseInt(st.nextToken());
			int[] arr = new int[T];
			int sum=0;
			double average=0;
			int avgMan=0;
			double count=0;
			
			for(int i=0 ; i<T;i++) {
				arr[i]= Integer.parseInt(st.nextToken());
				sum +=arr[i];
			}
			average=(double)sum/(double)T;
			for(int i=0 ; i<T;i++) {
				if(average<arr[i]) {
					avgMan++;
				}
			}
			
			count = (double)avgMan/(double)T*100;
			bw.write(String.format("%.3f", count)+"%\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}