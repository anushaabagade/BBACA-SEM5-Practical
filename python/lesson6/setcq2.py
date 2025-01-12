class Engine:
    def __init__(self, horsepower):
        self.horsepower = horsepower

    def start_engine(self):
        print(f"Engine with {self.horsepower} horsepower has started.")

class Car:
    def __init__(self, model, engine):
        self.model = model
        self.engine = engine

    def start_car(self):
        print(f"The car model {self.model} is starting.")
        self.engine.start_engine()

my_engine = Engine(200)

my_car = Car("Toyota Corolla", my_engine)

my_car.start_car()
