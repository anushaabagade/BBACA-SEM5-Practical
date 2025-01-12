stack = []
def push(item):
    stack.append(item)
    print(f"Pushed: {item}")

def pop():
    if stack:
        item = stack.pop()
        print(f"Popped: {item}")
        return item
    else:
        print("Stack is empty!")

def peek():
    if stack:
        return stack[-1]
    else:
        print("Stack is empty!")
        return None


def is_empty():
    return len(stack) == 0


def display():
    print(f"Stack: {stack}")


push(10)
push(20)
push(30)
display()

pop()
print(f"Top item: {peek()}")
display()
