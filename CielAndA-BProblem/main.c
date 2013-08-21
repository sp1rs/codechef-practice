#include<stdio.h>
int main(){
	int x,y;
	scanf("%d%d",&x,&y);
	int su=0;
	if(x>y)
		su=x-y;
	else
		su=y-x;
	if(su%10==9)
		printf("%d\n",su-1);
	else
		printf("%d\n",su+1);
}
