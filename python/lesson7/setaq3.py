class MyError(Exception):
    def __init__(self, message, extra_data):
        super().__init__(message)
        self.extra_data = extra_data

def oops():
    raise MyError("This is a custom exception MyError.", {"info": "Some extra data"})

def handle_oops():
    try:
        oops()
    except IndexError as e:
        print(f"IndexError caught: {e}")
    except MyError as e:
        print(f"MyError caught: {e}")
        print(f"Extra data: {e.extra_data}")

handle_oops()
