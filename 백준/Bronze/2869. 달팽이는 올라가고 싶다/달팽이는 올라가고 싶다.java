import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long V = Integer.parseInt(st.nextToken());

        long days = (V-B) / (A-B);
        
		if ((V - B) % (A - B) != 0) {
			days++;
		}
        System.out.println(days);
    }
}
