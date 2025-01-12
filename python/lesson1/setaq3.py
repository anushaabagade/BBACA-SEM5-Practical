
num = int(input("Enter a number: "))

div_sum = sum(i for i in range(1, num) if num % i == 0)

if div_sum == num:
    print("Number is a perfect number.")
else:
    print("Number is not a perfect number.")
