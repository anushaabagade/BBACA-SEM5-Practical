import tkinter as tk
import random

def change_background_color():
    colors = ['#FFDDC1', '#FFABAB', '#FFC3A0', '#FF677D', '#D4A5A5', '#392F5A']
    new_color = random.choice(colors)
    root.configure(bg=new_color)
    root.after(1000, change_background_color)

root = tk.Tk()
root.title("Changing Background Colors")
root.configure(bg='#FFDDC1')
change_background_color()
root.mainloop()
