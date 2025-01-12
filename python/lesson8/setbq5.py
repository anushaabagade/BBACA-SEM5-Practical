import tkinter as tk
from tkinter import ttk

def number_to_words(number):
    digit_words = {
        '0': 'Zero', '1': 'One', '2': 'Two', '3': 'Three',
        '4': 'Four', '5': 'Five', '6': 'Six', '7': 'Seven',
        '8': 'Eight', '9': 'Nine'
    }
    
    number_str = str(number)
    words_list = [digit_words[digit] for digit in number_str if digit in digit_words]
    
    return ' '.join(words_list)

def display_digits_in_words():
    try:
        number = entry.get()
        words = number_to_words(number)
        result_label.config(text=words)
    except ValueError:
        result_label.config(text="Invalid input. Please enter a valid number.")

root = tk.Tk()
root.title("Number to Words Converter")

tk.Label(root, text="Enter number:").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)

entry = ttk.Entry(root, width=20)
entry.grid(row=0, column=1, padx=10, pady=10)

convert_button = ttk.Button(root, text="Convert to Words", command=display_digits_in_words)
convert_button.grid(row=1, column=0, columnspan=2, pady=10)

result_label = tk.Label(root, text="", wraplength=300)
result_label.grid(row=2, column=0, columnspan=2, pady=10)

root.mainloop()
