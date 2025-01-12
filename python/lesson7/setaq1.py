class CustomException(Exception):
    def __init__(self, message):
        self.message = message
        super().__init__(self.message)

def check_value(value):
    if value < 0:
        raise CustomException("The value cannot be negative.")
    else:
        print(f"The value {value} is valid.")

try:
    check_value(-5)
except CustomException as e:
    print(f"CustomException caught: {e.message}")
