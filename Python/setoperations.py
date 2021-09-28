ls_set={1,7,3,9,22}
print(ls_set)

print(sorted(ls_set,reverse=True))

nw=[]
ls_list=list(ls_set)
while ls_list:
    max = ls_list[0]  
    for x in ls_list: 
        if x > max:
            max = x
    nw.append(max)
    ls_list.remove(max)  

print(nw)

