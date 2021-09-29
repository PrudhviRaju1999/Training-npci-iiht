s=[]
def calculate(action):
    if action == '1':
        return lambda x : s.append(x)
    elif action == '2':
        return lambda s: dict(zip(s, s))
    elif action == '3':
        return lambda y:sorted(y, key=y.get, reverse=True)
    else:
        return 0
z=calculate('1')
z(int(input()))
print(s)
z=calculate('2')
y=z(s)
print(y)



z=calculate('3')
sorted_keys = z(y)

for r in sorted_keys:
    print(r, y[r])
