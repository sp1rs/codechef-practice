#include<stdio.h>
int main(){
	float y;
	int x;
	scanf("%d%f",&x,&y);
	if(x%5==0 && x+0.50<=y){
		printf("%.2f",y-x-0.5);
	}else{
		printf("%f",y);
	}
	return 0;
}
