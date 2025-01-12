import tkinter as tk
from tkinter import ttk
import time

def update_clock():
    current_time = time.strftime("%H:%M:%S")
    clock_label.config(text=current_time)
    root.after(1000, update_clock)

root = tk.Tk()
root.title("Digital Clock")

clock_label = ttk.Label(root, font=("Helvetica", 48), background="black", foreground="white")
clock_label.pack(padx=20, pady=20)

update_clock()
root.mainloop()
