import tkinter as tk
from tkinter import font

def update_font():
    selected_font_name = font_name_var.get()
    selected_font_size = font_size_var.get()
    is_bold = bold_var.get()

    font_style = font.Font(family=selected_font_name, size=selected_font_size, weight='bold' if is_bold else 'normal')
    
    label.config(font=font_style)

root = tk.Tk()
root.title("Font Style Changer")

font_name_var = tk.StringVar(value='Arial')
font_size_var = tk.IntVar(value=12)
bold_var = tk.BooleanVar(value=False)

tk.Label(root, text="Select Font Style").grid(row=0, column=0, columnspan=2, padx=10, pady=10)

tk.Checkbutton(root, text="Arial", variable=font_name_var, onvalue='Arial', offvalue='Arial', command=update_font).grid(row=1, column=0, padx=10, pady=5, sticky=tk.W)
tk.Checkbutton(root, text="Courier", variable=font_name_var, onvalue='Courier', offvalue='Courier', command=update_font).grid(row=2, column=0, padx=10, pady=5, sticky=tk.W)
tk.Checkbutton(root, text="Times New Roman", variable=font_name_var, onvalue='Times New Roman', offvalue='Times New Roman', command=update_font).grid(row=3, column=0, padx=10, pady=5, sticky=tk.W)

tk.Checkbutton(root, text="10", variable=font_size_var, onvalue=10, offvalue=10, command=update_font).grid(row=1, column=1, padx=10, pady=5, sticky=tk.W)
tk.Checkbutton(root, text="12", variable=font_size_var, onvalue=12, offvalue=12, command=update_font).grid(row=2, column=1, padx=10, pady=5, sticky=tk.W)
tk.Checkbutton(root, text="16", variable=font_size_var, onvalue=16, offvalue=16, command=update_font).grid(row=3, column=1, padx=10, pady=5, sticky=tk.W)

tk.Checkbutton(root, text="Bold", variable=bold_var, command=update_font).grid(row=4, column=0, columnspan=2, padx=10, pady=10)

label = tk.Label(root, text="Sample Text", font=('Arial', 12))
label.grid(row=5, column=0, columnspan=2, padx=10, pady=10)
root.mainloop()
