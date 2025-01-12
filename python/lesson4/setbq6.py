def is_prime(num):
    """Check if a number is a prime number."""
    if num <= 1:
        return False
    if num <= 3:
        return True
    if num % 2 == 0 or num % 3 == 0:
        return False
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i += 6
    return True

def prime_generator(n):
    """Generator function to yield prime numbers up to n."""
    for num in range(2, n + 1):
        if is_prime(num):
            yield num

# Example usage
n = 20
print(f"Prime numbers up to {n}:")
for prime in prime_generator(n):
    print(prime)