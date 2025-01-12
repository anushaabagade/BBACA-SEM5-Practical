number = int(input("Enter a number: "))

str_number = str(number)

reversed_str_number = str_number[::-1]

if str_number == reversed_str_number:
    print(f"{number} is a palindrome.")
else:
    print(f"{number} is not a palindrome.")
