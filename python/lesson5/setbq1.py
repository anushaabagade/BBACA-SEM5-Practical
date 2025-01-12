class Rectangle:
    def __init__(self, length, width, height=0):
        self.length = length
        self.width = width
        self.height = height

    def area(self):
        return self.length * self.width

    def volume(self):
        if self.height == 0:
            raise ValueError("Height must be provided to compute volume for a 3D rectangle.")
        return self.length * self.width * self.height

    def __str__(self):
        if self.height > 0:
            return (f"Rectangle with length {self.length}, width {self.width}, "
                    f"and height {self.height}. Area: {self.area()}, Volume: {self.volume()}")
        return (f"Rectangle with length {self.length} and width {self.width}. "
                f"Area: {self.area()}")


if __name__ == "__main__":
    length = float(input("Enter the length of the rectangle: "))
    width = float(input("Enter the width of the rectangle: "))
    
    height_input = input("Enter the height of the rectangle (or press Enter if not applicable): ")
    height = float(height_input) if height_input else 0

    rectangle = Rectangle(length, width, height)

    print(rectangle)
