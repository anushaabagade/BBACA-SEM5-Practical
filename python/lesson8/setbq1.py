import tkinter as tk
from tkinter import ttk
from datetime import datetime

def calculate_age():
    try:
        day = int(day_entry.get())
        month = int(month_entry.get())
        year = int(year_entry.get())
        
        dob = datetime(year, month, day)
        today = datetime.today()
        
        age = today.year - dob.year - ((today.month, today.day) < (dob.month, dob.day))
        
        age_label.config(text=f"Your Age: {age} years")
    except ValueError:
        age_label.config(text="Invalid input. Please enter valid date values.")

root = tk.Tk()
root.title("Age Calculator")

tk.Label(root, text="Day:").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)
tk.Label(root, text="Month:").grid(row=1, column=0, padx=10, pady=10, sticky=tk.E)
tk.Label(root, text="Year:").grid(row=2, column=0, padx=10, pady=10, sticky=tk.E)

day_entry = ttk.Entry(root, width=5)
day_entry.grid(row=0, column=1, padx=10, pady=10)
month_entry = ttk.Entry(root, width=5)
month_entry.grid(row=1, column=1, padx=10, pady=10)
year_entry = ttk.Entry(root, width=10)
year_entry.grid(row=2, column=1, padx=10, pady=10)

calculate_button = ttk.Button(root, text="Calculate Age", command=calculate_age)
calculate_button.grid(row=3, column=0, columnspan=2, pady=10)

age_label = tk.Label(root, text="")
age_label.grid(row=4, column=0, columnspan=2, pady=10)
root.mainloop()
