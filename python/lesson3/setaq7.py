my_dict = {'apple': 3, 'banana': 1, 'cherry': 2, 'date': 5}

sorted_asc = dict(sorted(my_dict.items(), key=lambda item: item[1]))

sorted_desc = dict(sorted(my_dict.items(), key=lambda item: item[1], reverse=True))

print("Dictionary sorted in ascending order:", sorted_asc)
print("Dictionary sorted in descending order:", sorted_desc)
