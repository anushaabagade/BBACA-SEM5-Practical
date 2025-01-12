class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return "Some generic animal sound"

class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name)
        self.breed = breed

    def speak(self):
        return "Woof!"

class Cat(Animal):
    def __init__(self, name, color):
        super().__init__(name)
        self.color = color

    def speak(self):
        return "Meow!"

dog = Dog(name="Coco", breed="Labrador")
cat = Cat(name="Whiskers", color="cream")
generic_animal = Animal(name="Generic Animal")

print(isinstance(dog, Dog))
print(isinstance(cat, Cat))
print(isinstance(dog, Animal))
print(isinstance(cat, Animal))
print(isinstance(generic_animal, Dog))

print(issubclass(Dog, Animal))
print(issubclass(Cat, Animal))
print(issubclass(Animal, Dog))
print(issubclass(Dog, object))
print(issubclass(Cat, object))
