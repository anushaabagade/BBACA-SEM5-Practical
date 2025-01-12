import math
class Shape:
    def __init__(self):
        pass

    def area(self):
        return 0

    def volume(self):
        return 0

class Square(Shape):
    def __init__(self, length):
        super().__init__()
        self.length = length

    def area(self):
        return self.length ** 2

    def volume(self):
        return 0

class Circle(Shape):
    def __init__(self, radius):
        super().__init__()
        self.radius = radius

    def area(self):
        return math.pi * (self.radius ** 2)

    def volume(self):
        return 0
square = Square(5)
circle = Circle(3)

print(f"Square area: {square.area()}")
print(f"Square volume: {square.volume()}")
print(f"Circle area: {circle.area():.2f}")
print(f"Circle volume: {circle.volume()}")
