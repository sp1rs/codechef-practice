class Main:
	t=int(input())
	while(t>0):
		s=raw_input()
		s=s.split(" ")
		n=int(s[0])	
		l=[int(x) for x in s]
		l.pop(0)
		m=min(l)
		done=0
		while(m>0):
			i=0
			j=0
	
			while(i<n):
				if(l[i]%m==0):
					j+=1
				else:
					break;
			
				i+=1
			if(j==n):
				break
			
			m-=1
		if(m==0):
			for x in l:
				print x ,
		else:
			for x in l:
				print x/m ,
		print 
		t-=1
