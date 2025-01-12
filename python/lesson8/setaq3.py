import tkinter as tk
from tkinter import font

def update_font():
    selected_font = font_var.get()
    selected_size = size_var.get()
    is_bold = bold_var.get()
    
    font_style = (selected_font, selected_size, 'bold' if is_bold else 'normal')
    label.config(font=font_style)

root = tk.Tk()
root.title("Font Style Changer")

fonts = ['Arial', 'Helvetica', 'Times New Roman']
sizes = [10, 12, 14, 16, 18, 20, 24]

label = tk.Label(root, text="Change my font style!", font=('Arial', 12))
label.pack(pady=20)

font_var = tk.StringVar(value='Arial')
font_menu = tk.OptionMenu(root, font_var, *fonts)
font_menu.pack(pady=5)

size_var = tk.IntVar(value=12)
size_menu = tk.OptionMenu(root, size_var, *sizes)
size_menu.pack(pady=5)

bold_var = tk.BooleanVar(value=False)
bold_check = tk.Checkbutton(root, text="Bold", variable=bold_var)
bold_check.pack(pady=5)

apply_button = tk.Button(root, text="Apply Font Style", command=update_font)
apply_button.pack(pady=20)
root.mainloop()
