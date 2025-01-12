import tkinter as tk
from tkinter import ttk

def check_number():
    try:
        number = int(entry.get())
        selection = var.get()
        
        if selection == 'prime':
            result = is_prime(number)
        elif selection == 'perfect':
            result = is_perfect(number)
        elif selection == 'armstrong':
            result = is_armstrong(number)
        else:
            result = "Select an option"
        
        result_label.config(text=result)
    except ValueError:
        result_label.config(text="Invalid input. Please enter a valid integer.")

def is_prime(n):
    if n <= 1:
        return f"{n} is not a prime number."
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return f"{n} is not a prime number."
    return f"{n} is a prime number."

def is_perfect(n):
    if n <= 0:
        return f"{n} is not a perfect number."
    sum_of_divisors = sum(i for i in range(1, n) if n % i == 0)
    return f"{n} is a perfect number." if sum_of_divisors == n else f"{n} is not a perfect number."

def is_armstrong(n):
    digits = str(n)
    num_digits = len(digits)
    sum_of_powers = sum(int(digit) ** num_digits for digit in digits)
    return f"{n} is an Armstrong number." if sum_of_powers == n else f"{n} is not an Armstrong number."

root = tk.Tk()
root.title("Number Classification")

tk.Label(root, text="Enter a number:").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)

entry = ttk.Entry(root, width=20)
entry.grid(row=0, column=1, padx=10, pady=10)

var = tk.StringVar(value='prime')

tk.Radiobutton(root, text="Prime", variable=var, value='prime').grid(row=1, column=0, padx=10, pady=5, sticky=tk.W)
tk.Radiobutton(root, text="Perfect", variable=var, value='perfect').grid(row=2, column=0, padx=10, pady=5, sticky=tk.W)
tk.Radiobutton(root, text="Armstrong", variable=var, value='armstrong').grid(row=3, column=0, padx=10, pady=5, sticky=tk.W)

check_button = ttk.Button(root, text="Check", command=check_number)
check_button.grid(row=4, column=0, columnspan=2, pady=10)

result_label = tk.Label(root, text="", wraplength=300)
result_label.grid(row=5, column=0, columnspan=2, padx=10, pady=10)

root.mainloop()
