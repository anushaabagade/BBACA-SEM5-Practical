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
    except Exception as e:
        exc_type, exc_value, exc_traceback = sys.exc_info()
        print(f"Exception type: {exc_type.__name__}")
        print(f"Exception value: {exc_value}")
        print("Stack trace:")
        traceback.print_exc()

if __name__ == "__main__":
    safe(oops)

