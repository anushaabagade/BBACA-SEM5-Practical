import tkinter as tk
from tkinter import ttk

def add_item():
    item = entry.get()
    if item:
        listbox.insert(tk.END, item)
        entry.delete(0, tk.END)

def print_selected():
    selected_items = listbox.curselection()
    if selected_items:
        selected_text = [listbox.get(i) for i in selected_items]
        print("Selected items:", selected_text)
    else:
        print("No item selected")

def delete_selected():
    selected_items = listbox.curselection()
    for i in reversed(selected_items):
        listbox.delete(i)

root = tk.Tk()
root.title("Listbox Operations")

tk.Label(root, text="Item to add:").grid(row=0, column=0, padx=10, pady=10, sticky=tk.E)

entry = ttk.Entry(root, width=30)
entry.grid(row=0, column=1, padx=10, pady=10)

add_button = ttk.Button(root, text="Add Item", command=add_item)
add_button.grid(row=1, column=0, columnspan=2, pady=10)

listbox = tk.Listbox(root, selectmode=tk.MULTIPLE, width=50, height=10)
listbox.grid(row=2, column=0, columnspan=2, padx=10, pady=10)

print_button = ttk.Button(root, text="Print Selected", command=print_selected)
print_button.grid(row=3, column=0, padx=10, pady=10)

delete_button = ttk.Button(root, text="Delete Selected", command=delete_selected)
delete_button.grid(row=3, column=1, padx=10, pady=10)
root.mainloop()
