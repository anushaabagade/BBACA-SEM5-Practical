def decimal_to_binary(decimal_number):
    """Convert a decimal number to its binary representation."""
    return bin(decimal_number)[2:]

def decimal_to_octal(decimal_number):
    """Convert a decimal number to its octal representation."""
    return oct(decimal_number)[2:]

decimal_number = int(input("Enter a decimal number: "))

binary_representation = decimal_to_binary(decimal_number)
octal_representation = decimal_to_octal(decimal_number)

print(f"Decimal number {decimal_number} in binary is: {binary_representation}")
print(f"Decimal number {decimal_number} in octal is: {octal_representation}")
