class Area:
    def __init__(self):
        pass

    def display_area_info(self):
        print("This class helps in calculating area of shapes.")

class Square(Area):
    def __init__(self, side_length):
        super().__init__()
        self.side_length = side_length

    def calculate_area(self):
        return self.side_length ** 2

    def display_square_area(self):
        print(f"The area of the square with side {self.side_length} is {self.calculate_area()}.")

class Triangle(Area):
    def __init__(self, base, height):
        super().__init__()
        self.base = base
        self.height = height

    def calculate_area(self):
        return 0.5 * self.base * self.height

    def display_triangle_area(self):
        print(f"The area of the triangle with base {self.base} and height {self.height} is {self.calculate_area()}.")

square = Square(4)
triangle = Triangle(5, 3)

square.display_area_info()

square.display_square_area()
triangle.display_triangle_area()
