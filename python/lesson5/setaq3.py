class StringManipulator:
    def __init__(self):
        self.string = ""

    def get_String(self):
        self.string = input("Enter a string: ")

    def print_String(self):
        print("String in uppercase:", self.string.upper())

    def reverse_words_and_print(self):
        words = self.string.split()
        reversed_words = words[::-1]
        reversed_string = ' '.join(reversed_words)
        print("Reversed words in lowercase:", reversed_string.lower())

if __name__ == "__main__":
    sm = StringManipulator()
    sm.get_String()
    sm.print_String()
    sm.reverse_words_and_print()
