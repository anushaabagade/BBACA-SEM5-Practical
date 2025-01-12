import sys
import traceback

class MyError(Exception):
    def __init__(self, message, extra_data):
        super().__init__(message)
        self.extra_data = extra_data

def oops():
    raise MyError("This is a custom exception MyError.", {"info": "Some extra data"})

def safe(func, *args):
    try:
        func(*args)
    except MyError as e:
        print(f"Custom Exception caught: {e}")
        print(f"Extra data: {e.extra_data}")
        print("Stack trace:")
        traceback.print_exc()
    except IndexError as e:
        print(f"IndexError caught: {e}")
        print("Stack trace:")
        traceback.print_exc()
    except Exception as e:
        print(f"Other Exception caught: {e}")
        print("Stack trace:")
        traceback.print_exc()

if __name__ == "__main__":
    safe(oops)
