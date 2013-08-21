#include<iostream>
#include<stdio.h>
#include<algorithm>
#include<vector>
using namespace std;

int main()
{
	int n,q,x,i;
	scanf("%d %d",&n,&q);
	int arr[n];
	vector<int> occ[100005];
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
		for(x = 2;(x*x)<=arr[i];x++)
		{
			if(arr[i]%x==0)
			{
				occ[x].push_back(i);
				int tmp = arr[i]/x;
				if(x!=tmp)
				occ[tmp].push_back(i);
			}
		}
		occ[1].push_back(i);
		if(arr[i]!=1)
		occ[arr[i]].push_back(i);
	}
	int l,r,k;
	std::vector<int>::iterator low,up;
//	int arr1[5] = {2, 3, 4, 5, 6};
	while(q--)
	{
		scanf("%d %d %d",&l,&r,&k);
		l--;r--;
		
//		low = upper_bound(arr1,arr1+5,3);
//		up = upper_bound(arr1,arr1+5,5);
//		for(i=0;i<occ[k].size
		low = lower_bound(occ[k].begin(),occ[k].end(),l);
		up = upper_bound(occ[k].begin(),occ[k].end(),r);
		
		
		cout << up-low << endl;
//		cout << low-occ[k].begin() << endl;
	}
return 0;
}
