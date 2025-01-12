def replace_char(s):
    first_char = s[0]
    modified_string = first_char + s[1:].replace(first_char, '$')
    return modified_string

sample_string = 'restart'
result = replace_char(sample_string)
print(f"Original String: {sample_string}")
print(f"Modified String: {result}")
