from collections import Counter

my_tuple = (1, 2, 3, 2, 4, 5, 1, 6, 7, 5)
item_count = Counter(my_tuple)

repeated_items = [item for item, count in item_count.items() if count > 1]

print("Repeated items in the tuple:", repeated_items)
