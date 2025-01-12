class Dog:
    def speak(self):
        return "Woof!"

class Cat:
    def speak(self):
        return "Meow!"

class Duck:
    def speak(self):
        return "Quack!"

def make_it_speak(animal):
    """Function that expects an object with a 'speak' method."""
    print(animal.speak())

# Example usage
dog = Dog()
cat = Cat()
duck = Duck()

print("Dog says:")
make_it_speak(dog)

print("Cat says:")
make_it_speak(cat)

print("Duck says:")
make_it_speak(duck)
