s_dict={'One':'Two','Two':'One','Five':'Five'}
s_dct={1:2,12:1}
sorted_keys=sorted(s_dict,key=s_dict.get,reverse=False)
for i in sorted_keys :
    print ((i, s_dict[i]), end =" ")