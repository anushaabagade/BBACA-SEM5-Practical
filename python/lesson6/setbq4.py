class Country:
    def __init__(self):
        self.nationality = ""

    def accept_nationality(self):
        self.nationality = input("Enter your nationality: ")

    def print_nationality(self):
        print(f"Nationality: {self.nationality}")

class State(Country):
    def __init__(self):
        super().__init__()
        self.state = ""
        self.country = ""

    def accept_state_country(self):
        self.state = input("Enter your state: ")
        self.country = input("Enter your country: ")

    def print_state(self):
        print(f"State: {self.state}")
    
    def print_state_country_nationality(self):
        self.print_state()
        print(f"Country: {self.country}")
        self.print_nationality()

person = State()

person.accept_nationality()
person.accept_state_country()

person.print_state_country_nationality()
