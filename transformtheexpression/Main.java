import java.io.*;
public class Main{
	private static  char array[];
	private static  int size=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String s=br.readLine();
			array=new char[s.length()];
			for(int j=0;j<s.length();j++){
				int y=(int)s.charAt(j);
				if(y>=97 && y<=122){
					System.out.print(s.charAt(j));
				}else{
					if(s.charAt(j)=='('){
						push(s.charAt(j));
					}else if(s.charAt(j)==')'){
						char c;
						while((c=pop())!='('){
							System.out.print(c);
						}
						
					}else{
						while(test(array[size-1])<test(s.charAt(j))){
							System.out.print(pop());
						}
						push(s.charAt(j));
					}
				}
			}
			System.out.println();
		}
	}
		
	public static  void push(char ch){
		array[size++]=ch;
	}
	public static  char pop(){
		size--;
		return array[size];
	}
	public static  char peek(){
		
		return array[size-1];
	}
	public static int test(char ch){
		int x=0;
		switch(ch){

			case '+':
				x= 1;
				break;
			case '-':
				x= 2;
				break;
			case '*':
				x= 3;
				break;
			case '/':
				x= 4;
				break;
			case '(':
				x= 5;
				break;
		}
		return x;
	}
}
