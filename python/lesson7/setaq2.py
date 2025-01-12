def oops():
    raise IndexError("This is a custom IndexError raised by the oops function.")

def handle_oops():
    try:
        oops()
    except IndexError as e:
        print(f"Exception caught: {e}")

handle_oops()
