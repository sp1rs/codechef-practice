import java.io.*;
public class theleadgame{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int max=0;
		int temp=0;
		int diff=0;
		int won=0;
	
		String s[]=new String[2];
		for(int i=0;i<t;i++){
			String str=br.readLine();
		 	s=str.split(" ");
			int a1=Integer.parseInt(s[0]);
			int a2=Integer.parseInt(s[1]);
			if(temp==0)
				a1=a1+diff;
			else
				a2=a2+diff;
			if(a1>a2){
				diff=a1-a2;
			//	s[2]="0";
				temp=0;
			}else if(a2 >= a1){
				diff=a2-a1;
			//	s[2]="1";
				temp=1;
			}
			if(diff>max){
				max=diff;
				won=temp+1;
			}
		}
		System.out.println(won+" "+max);
	}
}
