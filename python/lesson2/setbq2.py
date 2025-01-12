def swapcombine(str1, str2):
    if len(str1) < 2 or len(str2) < 2:
        return "Both strings must have at least 2 characters."
    
    new_str1 = str2[:2] + str1[2:]
    new_str2 = str1[:2] + str2[2:]
    
    result = new_str1 + ' ' + new_str2
    
    return result
str1 = input("Enter the first string: ")
str2 = input("Enter the second string: ")

print(swapcombine(str1, str2))

