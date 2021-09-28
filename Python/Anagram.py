"""while ls_list:
    max = ls_list[0]  
    for x in ls_list: 
        if x > min:
            min = x
    nw.append(min)
    ls_list.remove(min)  

print(nw)"""




s1="madm"
s2="mmad"
s3="mdma"
if (len(s1)==len(s2)):
    if ((list(s1.lower())).sort() == (list(s2.lower()).sort())):
        print("Anagram 1&2")
        if (len(s1)==len(s3)):
            if ((list(s1.lower())).sort() == (list(s3.lower()).sort())):
                print("Anagram 1&2&3")

