import java.io.*;
import java.util.*;
public class Main{
	public static long a[];
	public static void main(String[] args){
		int t=10;
		Scanner sc=new Scanner(System.in);
		a=new long[100000];
		while(sc.hasNext()){
			int n=Integer.parseInt(sc.next());
			System.out.println(sol(n));
			t-=1;
		}
	}
	public static long sol(int n){
		if(n==0){
			return 0;
		}else if(n<100000){
			if(a[n]==0){
				 a[n]=max(n,sol(n/2)+sol(n/3)+sol(n/4));
				 return a[n];
			}else{
				return a[n];
			}
		}else{
			return  max(n,sol(n/2)+sol(n/3)+sol(n/4));
			
		}
	}
	public static long max(long i,long j){
		
		if(i>=j)
			return i;
		else	
			return j;
	}
}
