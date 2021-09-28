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

#asssignment 2

s1="mad"
s2="bam"
s3="adm"

if sorted(s1)==sorted(s2):
    if sorted(s1)==sorted(s3):
        print("Yes 3 strings are anagrams")
else:
    print("Not anagramas") 


#Assignment 3
list_ls=[1,2,3,4,7,8,9]

for i in range(list_ls[0],list_ls[-1]+1):
    if i not in list_ls:
     print(i)

