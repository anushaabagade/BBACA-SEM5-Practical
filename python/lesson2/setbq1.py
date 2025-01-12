def transform(input_str):
    if len(input_str) < 2:
        return ''
    return input_str[:2] + input_str[-2:]

print(transform('General12'))
print(transform('Ka'))
print(transform('K'))
