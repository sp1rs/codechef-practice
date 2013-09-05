import java.io.*;
public class Main{
	public static int n=0;
	public static int cache[][];
	public static int a[][];
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int l=0;l<t;l++){
			n=Integer.parseInt(br.readLine());
			cache=new int[n][n];
			a=new int[n][n];
			for(int i=0;i<n;i++){
				String s=br.readLine();
				String str[]=s.split(" ");
				for(int j=0;j<=i;j++){
					a[i][j]=Integer.parseInt(str[j]);
				}
			}
			System.out.println(check(0,0));
		}
	}
	public static int check(int r,int c){
		if(r>=n){
			return 0;
		}else if(cache[r][c]!=0){
			return cache[r][c];
		}else{
		int t1=check(r+1,c);
		int t2=check(r+1,c+1);
		int t=max(t1,t2)+a[r][c];
		cache[r][c]=t;
		return t;
		}
		
	}
	public static int max(int i,int j){
		if(i>j)
			return i;
		else
			return j;
	}	
}

