import pandas
d = pandas.read_excel('sample.xlsx')
print("Number of rows and columns:", d.shape)
print("Emails:")
print(dataframe['Email'])
print("Sorted data:")
print(dataframe.sort_values('FirstName'))