import pandas
data={"Usernames": ["admin", "Charles", "Deku"],
         "Passwords": ["password", "Charl13", "AllMight"]}

d=pandas.DataFrame(data)
d.to_csv("Data.csv")

