values = []

print("Enter 5 integers:")

for i in range(5):
    num = int(input(f"Enter integer {i + 1}: "))
    values.append(num)
if len(values) != len(set(values)):
    print("DUPLICATES")
else:
    print("ALL UNIQUE")
