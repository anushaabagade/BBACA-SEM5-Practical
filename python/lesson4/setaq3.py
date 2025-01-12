def find_union_and_intersection(str1, str2):
    set1 = set(str1)
    set2 = set(str2)
    union = set1.union(set2)
    intersection = set1.intersection(set2)
    
    return union, intersection
string1 = "hello"
string2 = "world"

union, intersection = find_union_and_intersection(string1, string2)

print("Union of characters:", union)
print("Intersection of characters:", intersection)
