class RepeatedString:
    def __init__(self, text):
        self.text = text

    def __mul__(self, n):
        if isinstance(n, int) and n >= 0:
            return self.text * n
        else:
            raise ValueError("The number of repetitions must be a non-negative integer.")

    def __str__(self):
        return self.text

if __name__ == "__main__":
    user_string = input("Enter a string: ")
    try:
        n = int(input("Enter the number of repetitions: "))
    except ValueError:
        print("Invalid input. Number of repetitions must be an integer.")
        exit(1)

    repeated_string = RepeatedString(user_string)
    try:
        result = repeated_string * n
        print("Repeated string:")
        print(result)
    except ValueError as e:
        print(e)
