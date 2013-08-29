import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		boolean a[];
		for(int i=0;i<t;i++){
//			a=new boolean[1001];
			String s=br.readLine();
			String s1[]=s.split(" ");
			int n=Integer.parseInt(s1[0]);
			int m=Integer.parseInt(s1[1]);
			a=new boolean[n+1];
			s=br.readLine();
			String d[]=s.split(" ");
			int j=0;
			while(j<=(s.length())/2){
				a[Integer.parseInt(d[j])]=true;
				j++;
			}
			j=1;
			int done=1;
			while(j<=n){
				if(a[j]==false){
					if(done==1){
						a[j]=true;
						System.out.print(j+" ");
						done=0;	
					}else{
						done=1;
					}
				}
				j++;
			}
			System.out.println();
			j=1;
			while(j<=n){
				if(a[j]==false)
					System.out.print(j+" ");
				j++;
			}
			System.out.println();
			
		} 

	}
}
