import math

print "what"
lst = []
for a in range(2, 101):
    for b in range(2, 101):
        lst.append(math.pow(a, b))


lst = list(set(lst))
print lst
print len(lst)
