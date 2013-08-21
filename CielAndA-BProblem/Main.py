class Main:
	s=raw_input()
	s=s.split(" ")
	l=[int(x) for x in s]
	su=0
	if(l[0]>l[1]):
		su=l[0]-l[1]
	else:
		su=l[1]-l[0]
	if(su%10==9):
		su-=1	
		print su
	else:
		su+=1
		print su
	
