tot_lit=int(input())
good_road=int(input())
bad_road=int(input())
up_hill=int(input())
good_mil=good_road/15
bad_mil=bad_road/10
up_mil=up_hill/6
mil=good_mil+bad_mil+up_mil
total_distance=good_road+bad_road+up_hill
total_millage=total_distance/mil
petrol_remaining=tot_lit-total_millage
print(total_millage)
print(petrol_remaining)
