class Main:
	t=int(input())
	while(t>0):
		n=int(input())	
		s=raw_input()
		s=s.split(" ")
		p=[int(x) for x in s]
		s=raw_input()
		s=s.split(" ")
		c=[int(x) for x in s]
		c.sort()
		p.sort()
		i=n-1
		j=n-1
		sol=0
		while(i>=0):
			if(p[i]<=c[j]):
				sol+=1
				j-=1
			i-=1
		print sol
		t-=1
