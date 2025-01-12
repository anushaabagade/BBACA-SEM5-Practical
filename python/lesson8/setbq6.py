import tkinter as tk
from tkinter import ttk

def convert_number():
    try:
        decimal_number = int(entry.get())
        
        binary_number = bin(decimal_number)[2:]
        octal_number = oct(decimal_number)[2:]
        hexadecimal_number = hex(decimal_number)[2:].upper()
        
        binary_label.config(text=f"Binary: {binary_number}")
        octal_label.config(text=f"Octal: {octal_number}")
        hex_label.config(text=f"Hexadecimal: {hexadecimal_number}")
        
    except ValueError:
        binary_label.config(text="Invalid input. Please enter a valid decimal number.")
        octal_label.config(text="")
        hex_label.config(text="")

root = tk.Tk()
root.title("Decimal to Binary, Octal, and Hexadecimal Converter")

tk.Label(root, text="Enter a number:").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)

entry = ttk.Entry(root, width=20)
entry.grid(row=0, column=1, padx=10, pady=10)

convert_button = ttk.Button(root, text="Convert", command=convert_number)
convert_button.grid(row=1, column=0, columnspan=2, pady=10)

binary_label = tk.Label(root, text="")
binary_label.grid(row=2, column=0, columnspan=2, pady=5)

octal_label = tk.Label(root, text="")
octal_label.grid(row=3, column=0, columnspan=2, pady=5)

hex_label = tk.Label(root, text="")
hex_label.grid(row=4, column=0, columnspan=2, pady=5)

root.mainloop()
