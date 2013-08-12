import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String s=br.readLine();
			int c=0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='A' || s.charAt(j)=='D' || s.charAt(j)=='O' || s.charAt(j)=='P' || s.charAt(j)=='Q' || s.charAt(j)=='R')
					c++;
				if(s.charAt(j)=='B')
					c+=2;
			}
			System.out.println(c);
		}
	}
}
