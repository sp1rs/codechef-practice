import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();		
		String s[]=s1.split(" ");
		int a=Integer.parseInt(s[0]);
		int n=Integer.parseInt(s[1]);
		int k=Integer.parseInt(s[2]);
		n++;
		while(k-->0){
			System.out.print(a%n+" ");
			a=a/n;
		}
		System.out.println();
	}
}
