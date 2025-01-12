def fibonacci_generator():
    a, b = 0, 1
    while True:
        yield a
        a, b = b, a + b

n_terms = 10
fib_gen = fibonacci_generator()

print("First", n_terms, "Fibonacci numbers:")
for _ in range(n_terms):
    print(next(fib_gen))
