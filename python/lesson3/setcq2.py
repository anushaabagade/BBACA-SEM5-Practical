from collections import Counter

# Define the dictionaries
d1 = {'a': 100, 'b': 200, 'c': 300}
d2 = {'a': 300, 'b': 200, 'd': 400}

# Combine the dictionaries and add values for common keys
combined_counter = Counter(d1) + Counter(d2)

print("Combined dictionary with summed values:", combined_counter)
