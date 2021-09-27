n=5
print("tower problem")
i=0
while i<=n:
    j=1
    while j<=i:
        print(2*i-1,end=" ")
        j=j+1
    i=i+1
    print()

i=1
j=1
while i<=n:
    x=2*i-1
    y=x*j
    print("row ",i," ",y)
    j=j+1
    i=i+1

