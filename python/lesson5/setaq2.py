class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"

class Circle:
    def __init__(self, center, radius):
        self.center = center
        self.radius = radius

    def __str__(self):
        return f"Circle with center {self.center} and radius {self.radius}"

# Function to accept user input and create a Circle object
def create_circle_from_input():
    # Accept center coordinates from the user
    x = float(input("Enter the x-coordinate of the center: "))
    y = float(input("Enter the y-coordinate of the center: "))
    center = Point(x, y)

    # Accept radius from the user
    radius = float(input("Enter the radius of the circle: "))

    # Create a Circle object
    circle = Circle(center, radius)

    return circle

# Main program
if __name__ == "__main__":
    circle = create_circle_from_input()
    print(circle)
