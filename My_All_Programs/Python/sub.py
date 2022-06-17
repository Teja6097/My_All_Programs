##def count(x):
##    n=len(x)
##    return int(n*(n+1)/2)
##
##s=input()
##print(count(s))
def group_digits(number, separator ):
    group_size=3
    if (number < 0):
        prefix = '-'
        number = -number;
    else:
        prefix = ''
    string = "{0}".format(number)
    dot_index = string.find('.');
    string_size = len(string) if dot_index == -1 else dot_index

    if string_size > group_size:
        groups = []
        first_group_size = string_size % group_size;
        if first_group_size:
            groups.append(string[0:first_group_size])
        for i in range(first_group_size, string_size, group_size):
            groups.append(string[i:i+group_size])
        return_string = separator.join(groups)
       return_string = return_string if dot_index == -1 else return_string + string[dot_index:]
    else:
        return_string = string

    return prefix + return_string

x=int(input())
d=input()
y=groupDigits(x,d)
print(y)
