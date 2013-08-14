class Main:
	s=raw_input()
	s=s.split(" ")
	l=[int(x) for x in s]
	l[1]+=1
	while(l[2]>0):
		print l[0]%l[1] ,
		l[0]=l[0]/l[1]
		l[2]-=1
