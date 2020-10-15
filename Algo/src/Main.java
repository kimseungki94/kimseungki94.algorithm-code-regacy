import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
 
public class Main {
 
    static int N,M;
    static int[] map;
    static boolean[] visited;
    static LinkedHashSet<String> set = new LinkedHashSet<>();
    static StringBuffer sb = new StringBuffer();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(map);
        for(int i=0;i<map.length;i++) {
        	System.out.println(map[i]);
        }
        solve(0,"");
        
        for(String s : set) {
            sb.append(s.substring(0, s.length()-1)+"\n");
        }
        System.out.print(sb.toString());
    }
    
    static void solve(int cnt, String s) {
        
        if(cnt == M) {
            set.add(s);
            return ;
        }
        
        for (int i = 0; i < N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            solve(cnt+1,s+map[i]+" ");
            visited[i] = false;
        }
    }
 
}