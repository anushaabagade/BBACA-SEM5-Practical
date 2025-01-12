class Team:
    def __init__(self, name):
        self.name = name

    def display_team(self):
        return f"Team Name: {self.name}"

class Dev(Team):
    def __init__(self, name, dev_role):
        super().__init__(name)
        self.dev_role = dev_role

    def display_dev_info(self):
        return f"Developer Role: {self.dev_role}"

class SeniorDev(Dev):
    def __init__(self, name, dev_role, experience):
        super().__init__(name, dev_role)
        self.experience = experience

    def display_senior_info(self):
        return f"Experience: {self.experience} years"

if __name__ == "__main__":
    senior_dev = SeniorDev("Alpha Team", "Backend Developer", 5)
    
    print(senior_dev.display_team())
    print(senior_dev.display_dev_info())
    print(senior_dev.display_senior_info())
