from collections import defaultdict
def max_sum_digit(A: list):
    sum_dict = defaultdict(list)
    A.sort()
    max_sum = -1
    for a in A:
        s = _digit_sum(a)
        sum_dict[s].append(a)
        ints = sum_dict[s]
        if len(ints) >= 2:
            max_sum = max(max_sum, ints[-1]+ints[-2])
    
    return max_sum

def _digit_sum(x: int) -> int:
    r,d,s = 0, x,0
    while d!= 0:
        r = d%10
        d = int(d/10)
        s += r
        
    return s
        
print(max_sum_digit([51,71,17,42]))
print(max_sum_digit([42,33,60]))
print(max_sum_digit([51,32,43]))

