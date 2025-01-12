n = input("Enter a number: ")
number_str = str(n)
first_digit = int(number_str[0])
last_digit = int(number_str[-1])
result = first_digit + last_digit
print(f"The sum of the first and last digit of {n} is {result}")
