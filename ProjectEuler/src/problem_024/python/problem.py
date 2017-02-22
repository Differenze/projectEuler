import math
def findperm(numbers, x):
    if(len(numbers) == 1):
        return numbers
#    print "findperm: " + repr(numbers) + "x: " + repr(x)
    subperm = math.factorial(len(numbers)-1)
#    print "subperm=" + repr(subperm)
    index = int(math.floor((x-1)/subperm))
#    print "index=" + repr(index)
    current = numbers[index]
    del numbers[index]
    return [current] + findperm(numbers, x-index*subperm)

numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
test = findperm(numbers, 1000000)
print test
