import tkinter as tk
from tkinter import scrolledtext

def insert_at_beginning():
    text_widget.insert('1.0', "Inserted at the beginning\n")

def insert_at_current_position():
    current_index = text_widget.index(tk.INSERT)
    text_widget.insert(current_index, "Inserted at the current position\n")

def delete_first_and_last():
    content = text_widget.get("1.0", tk.END)
    if content:
        content = content.rstrip()
        if len(content) > 0:
            new_content = content[1:-1]
            text_widget.delete("1.0", tk.END)
            text_widget.insert("1.0", new_content)

root = tk.Tk()
root.title("Text Widget Example")

text_widget = scrolledtext.ScrolledText(root, width=40, height=10)
text_widget.pack(pady=10)

text_widget.insert(tk.END, "This is some initial text.\n")

button_frame = tk.Frame(root)
button_frame.pack(pady=10)

insert_beginning_button = tk.Button(button_frame, text="Insert at Beginning", command=insert_at_beginning)
insert_beginning_button.pack(side=tk.LEFT, padx=5)

insert_current_button = tk.Button(button_frame, text="Insert at Current Position", command=insert_at_current_position)
insert_current_button.pack(side=tk.LEFT, padx=5)

delete_button = tk.Button(button_frame, text="Delete First and Last Character", command=delete_first_and_last)
delete_button.pack(side=tk.LEFT, padx=5)
root.mainloop()
