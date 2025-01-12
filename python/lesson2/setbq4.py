class Queue:
    def __init__(self):
        self.queue = []

    def is_empty(self):
        return len(self.queue) == 0

    def enqueue(self, item):
        self.queue.append(item)
        print(f"Enqueued: {item}")

    def dequeue(self):
        if self.is_empty():
            return "Queue is empty!"
        return self.queue.pop(0)

    def peek(self):
        if self.is_empty():
            return "Queue is empty!"
        return self.queue[0]

    def display(self):
        if self.is_empty():
            print("Queue is empty!")
        else:
            print("Queue:", self.queue)

q = Queue()

q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
q.display()

print("Dequeued:", q.dequeue())
q.display()

print("Peek:", q.peek())
q.display()
