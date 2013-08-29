class Main:
	t=int(input())
        while(t>0):
                x=int(input())
		r=0
		n=x
		if(x>2048):
			n=x/2048
			rem=x%2048
			count=0
			x=2048
			while(rem):
				count+=rem&1
				rem=rem>>1
			count+=n
			
        	else:	
			count=0
		        while(n):
				count+=n&1
				n=n>>1
		print count
		t-=1
