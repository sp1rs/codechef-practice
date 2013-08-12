import java.io.*;
import java.util.*;
public class Main{
	public static int a[];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(br.readLine());
			int m=Integer.parseInt(br.readLine());
			a=new int[n];
			for(int j=0;j<n;j++)
				a[j]=Integer.parseInt(br.readLine());
			Arrays.sort(a);
	
		}
	}
}
