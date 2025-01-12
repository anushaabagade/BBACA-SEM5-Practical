def generate_even_numbers(n):
    for number in range(2, n+1, 2):
        yield number

n = 20
for even_number in generate_even_numbers(n):
    print(even_number)
