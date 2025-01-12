import tkinter as tk
from tkinter import ttk

def convert_to_uppercase():
    input_text = text_entry.get()
    uppercase_text = input_text.upper()
    result_label.config(text=uppercase_text)

root = tk.Tk()
root.title("Text Uppercase Converter")

tk.Label(root, text="Enter text:").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)

text_entry = ttk.Entry(root, width=40)
text_entry.grid(row=0, column=1, padx=10, pady=10)

convert_button = ttk.Button(root, text="Convert to Uppercase", command=convert_to_uppercase)
convert_button.grid(row=1, column=0, columnspan=2, pady=10)

result_label = tk.Label(root, text="", wraplength=300)
result_label.grid(row=2, column=0, columnspan=2, pady=10)

root.mainloop()
