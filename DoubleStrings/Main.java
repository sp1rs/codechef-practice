import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int x=Integer.parseInt(br.readLine());
			if(x%2==0)
				System.out.println(x);
			else
				System.out.println(x-1);
		}
	}
}
