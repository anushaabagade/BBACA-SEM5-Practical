import tkinter as tk
from tkinter import ttk

def change_color(color):
    root.config(bg=color)

root = tk.Tk()
root.title("Color Menu Example")

menu_bar = tk.Menu(root)
root.config(menu=menu_bar)

color_menu = tk.Menu(menu_bar, tearoff=0)
menu_bar.add_cascade(label="Colors", menu=color_menu)

colors = ['Red', 'Green', 'Blue', 'Yellow', 'White', 'Black']
for color in colors:
    color_menu.add_command(label=color, command=lambda c=color: change_color(c.lower()))
root.mainloop()
