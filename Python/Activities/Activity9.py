l1 = list(input("Enter a sequence of comma separated values: ").split(","))
l2 = list(input("Enter a sequence of comma separated values: ").split(","))
l3=[]
for i in l1:
    if int(i)%2!=0:
        l3.append(i)
for i in l2:
    if int(i)%2==0:
        l3.append(i)
print("the new list is: ")
for i in l3:
    print(i)