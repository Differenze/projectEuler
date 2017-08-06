import math

def check(i, scale):
	summ = 0;
	for c in str(i):
		summ += math.pow(int(c), scale)
	return summ == i

scale = 5
lst = []
#print "("+str(math.pow(10, scale-1))+","+str(math.pow(10, scale)-1)+")"
for i in range(3, 1194979):
	if check(i, scale):
		print i
		lst.append(i)
print lst
print sum(lst)

