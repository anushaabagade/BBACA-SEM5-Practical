def sum_of_digits(n):
    if n == 0:
        return 0
    else:
        return n % 10 + sum_of_digits(n // 10)

number = 12345
result = sum_of_digits(number)
print(f"The sum of digits of {number} is {result}")
