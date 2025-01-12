import math

def cylinder_area_volume(radius, height):
    surface_area = 2 * math.pi * radius * (radius + height)
    volume = math.pi * radius ** 2 * height
    return surface_area, volume

def cuboid_area_volume(length, width, height):
    surface_area = 2 * (length * width + width * height + height * length)
    volume = length * width * height
    return surface_area, volume

cylinder_radius = 5
cylinder_height = 10
cylinder_surface_area, cylinder_volume = cylinder_area_volume(cylinder_radius, cylinder_height)
print(f"Cylinder with radius {cylinder_radius} and height {cylinder_height}:")
print(f"Surface Area: {cylinder_surface_area:.2f}")
print(f"Volume: {cylinder_volume:.2f}")

cuboid_length = 4
cuboid_width = 3
cuboid_height = 5
cuboid_surface_area, cuboid_volume = cuboid_area_volume(cuboid_length, cuboid_width, cuboid_height)
print(f"\nCuboid with length {cuboid_length}, width {cuboid_width}, and height {cuboid_height}:")
print(f"Surface Area: {cuboid_surface_area:.2f}")
print(f"Volume: {cuboid_volume:.2f}")
