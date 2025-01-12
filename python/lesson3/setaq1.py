def find_max_min(input_set):
    if len(input_set) == 0:
        return "The set is empty."
    
    max_value = max(input_set)
    min_value = min(input_set)
    
    return max_value, min_value

sample_set = {8, 3, 15, 2, 10, 6}

max_val, min_val = find_max_min(sample_set)

print(f"Maximum value in the set: {max_val}")
print(f"Minimum value in the set: {min_val}")
