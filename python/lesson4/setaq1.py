def print_reverse(s):
    if len(s) == 0:
        return
    else:
        print(s[-1], end='')
        print_reverse(s[:-1])

input_string = "Hello, world!"
print("Reversed string:", end=' ')
print_reverse(input_string)
