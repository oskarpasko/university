symbol = int(input("Enter Number of Symbols in the equation"))
print(symbol)
symbol_list=[]
for i in range(0, symbol):
    print("Enter",i+1," symbol name" )
    item = (input())
    symbol_list.append(symbols(item))
print("symbol list is ", symbol_list)
