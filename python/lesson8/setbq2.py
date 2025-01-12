import tkinter as tk
from tkinter import ttk

def alter_sentence():
    input_text = text_entry.get()
    
    altered_text = ''
    
    for char in input_text:
        if char.isalpha():
            if char.islower():
                altered_text += char.upper()
            else:
                altered_text += char.lower()
        elif char.isdigit():
            altered_text += '?'
        elif char == ' ':
            altered_text += '*'
        else:
            altered_text += char
    
    result_label.config(text=altered_text)

root = tk.Tk()
root.title("Sentence Alterer")

tk.Label(root, text="Enter sentence:").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)

text_entry = ttk.Entry(root, width=50)
text_entry.grid(row=0, column=1, padx=10, pady=10)

alter_button = ttk.Button(root, text="Alter Sentence", command=alter_sentence)
alter_button.grid(row=1, column=0, columnspan=2, pady=10)

result_label = tk.Label(root, text="", wraplength=400)
result_label.grid(row=2, column=0, columnspan=2, pady=10)
root.mainloop()
