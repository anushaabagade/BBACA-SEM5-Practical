class ClassA:
    def show_message(self):
        print("Message from Class A")

class ClassB:
    def show_message(self):
        print("Message from Class B")

class DerivedClass(ClassA, ClassB):
    def show_message(self):
        print("Message from Derived Class")
        ClassA.show_message(self)
        ClassB.show_message(self)

derived_obj = DerivedClass()

derived_obj.show_message()

