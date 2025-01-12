class Complex:
    def __init__(self, real, imag):
        self.real = real
        self.imag = imag

    def __add__(self, other):
        """Overload the + operator to add two complex numbers."""
        if isinstance(other, Complex):
            real_part = self.real + other.real
            imag_part = self.imag + other.imag
            return Complex(real_part, imag_part)
        return NotImplemented

    def __str__(self):
        """Return a string representation of the complex number."""
        return f"{self.real} + {self.imag}i"


if __name__ == "__main__":
    real1 = float(input("Enter the real part of the first complex number: "))
    imag1 = float(input("Enter the imaginary part of the first complex number: "))
    c1 = Complex(real1, imag1)

    real2 = float(input("Enter the real part of the second complex number: "))
    imag2 = float(input("Enter the imaginary part of the second complex number: "))
    c2 = Complex(real2, imag2)

    result = c1 + c2

    print(f"The sum of {c1} and {c2} is {result}")
