n=3
print("tower problem")
i=0

y=[]
z=[]
while i<=n:
    j=1
    x=0
    sum=0
    while j<=i:
        print(3*i-2+x,end=" ")
        z.append(3*i-2+x)
        sum=sum+ 3*i-2+x
        j=j+1
        x=x+1
    i=i+1
    print()
    y.append(sum)

print(y)
print(z)



i=1

while i<=n:
    print("Row ",i,"value is",y[i])
    i=i+1
sum=0
for i in range(len(z)): 
    sum=z[i]+sum
print("Row last value is",sum)
print("create Matrix")

z1=z[3:]
l2=[0,0]

z2=z[1:3]
z2.append(0)
z3=z[0:1]
z3=z3+l2
print(z1)
print(z2)
print(z3)



for i in range(len(z1)): 
    z1[i]=z1[i]**2
    z2[i]=z2[i]**2 
    z3[i]=z3[i]**2  
print(z1) 
print(z2)
print(z3)
