input_string = input("Enter a string: ")
result_string = ""

for i in range(len(input_string)):
    if i % 2 == 0:
        result_string += input_string[i]

print("String after removing characters with odd index values:", result_string)
