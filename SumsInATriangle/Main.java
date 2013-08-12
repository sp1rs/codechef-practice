import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=0;l<t;l++){
			int n=sc.nextInt();
			int a[][]=new int[n][n];
			int sum[]=new int[n];
			for(int i=0;i<n;i++){
				for(int j=0;j<=i;j++){
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<n;i++){
				sum[0]+=a[i][0];
				sum[n-1]+=a[i][i];
			}
			for(int i=1;i<n-1;i++){
				for(int j=i;j<n-1;j++){
					if(sum[j-1]+a[i+1][j]>sum[j]+a[i+1][j])
						sum[j]=sum[j-1]+a[i+1][j];
					else
						sum[j]=sum[j]+a[i+1][j];
				}
			}
			int max=0;
			for(int i=0;i<n;i++){
				if(sum[i]>max)
					max=sum[i];
			}
			System.out.println(max);
		}
	}
}
