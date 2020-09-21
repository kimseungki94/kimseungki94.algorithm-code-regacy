import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = null;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int result=0;
			
			for(int i=0;i<N;i++) {
				int value = arr[i];
				for(int j=i+1;j<N;j++) {
					value+=arr[j];
					if(M<value) {
						value=value-arr[j];
						break;
					}else {
						for(int z=j+1;z<N;z++) {
							value=value+arr[z];
							if(value<=M) {
								if(value>result) {
									result=value;
								}
								value=value-arr[z];
							}else {
								value=value-arr[z];
								break;
							}					
							
						}
						value=value-arr[j];
					}
					
				}
			}
			bw.write(result+"\n");
			bw.flush();
			bw.close();
	    }
}