class Main:
	t=int(input())
	for i in range(0,t):
		s=raw_input()
		s=s.split(" ")	
		n=int(s[0])
		m=int(s[1])
		boolean=[False]*(n+1)
		if(n!=0):
			if(m!=0):
				s=raw_input()
				s=s.split(" ")
			
				l=[int(x) for x in s]	
#				boolean=[False]*(n+1)
				j=1
				while(j<=m):
					boolean[l[j-1]]=True
					j+=1	

		j=1
		done=1
		while(j<=n):
			if(boolean[j]==False):
				if(done==1):
					boolean[j]=True
					print j,
					done=0
				else:
					done=1
			j+=1
		print
		j=1
		while(j<=n):
			if(boolean[j]==False):
				print j,
			j+=1
		print
			
