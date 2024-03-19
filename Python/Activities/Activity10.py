l2 = tuple(input("Enter a sequence of comma separated values: ").split(","))
for i in l2:
    if(int(i)%5==0):
        print(i,end=" ")