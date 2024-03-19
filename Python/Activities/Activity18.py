import pandas
d=pandas.read_csv("Data.csv")

print(d)
print("The username cloumn:\t")
print(d["Usernames"])
print("the second row:\t")
print(d["Usernames"][1]+" "+d["Passwords"][1])
print("usernames:\t")
print(d.sort_values("Usernames"))
print("passwords:\t")
print(d.sort_values("Passwords", ascending=False))



