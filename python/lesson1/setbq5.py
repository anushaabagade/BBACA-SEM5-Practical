start = int(input("Enter the start of the range: "))
end = int(input("Enter the end of the range: "))

for num in range(start, end + 1):
    print(f"\nMultiplication table for {num}:")
    for i in range(1, 11):
        print(f"{num} x {i} = {num * i}")
