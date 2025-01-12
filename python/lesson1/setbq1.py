def count_digits(number):
    even_count = 0
    odd_count = 0
    zero_count = 0

    for digit in str(number):
        if digit == '0':
            zero_count += 1
        elif int(digit) % 2 == 0:
            even_count += 1
        else:
            odd_count += 1

    print("Even digits:", even_count)
    print("Odd digits:", odd_count)
    print("Zero digits:", zero_count)

number = int(input("Enter a number: "))
count_digits(number)
