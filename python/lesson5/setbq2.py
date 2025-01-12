import math

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

class Circle:
    def __init__(self, center, radius):
        self.center = center
        self.radius = radius

def pt_in_circle(circle, point):
    """Check if a point lies on the boundary of the given circle."""
    distance = math.sqrt((point.x - circle.center.x) ** 2 + (point.y - circle.center.y) ** 2)
    

    return math.isclose(distance, circle.radius, rel_tol=1e-9)

if __name__ == "__main__":
    center = Point(0, 0)
    radius = 5
    circle = Circle(center, radius)
    
    point_x = float(input("Enter the x-coordinate of the point: "))
    point_y = float(input("Enter the y-coordinate of the point: "))
    point = Point(point_x, point_y)
    
    if pt_in_circle(circle, point):
        print("The point lies on the boundary of the circle.")
    else:
        print("The point does not lie on the boundary of the circle.")
