import tkinter as tk

def click_button(value):
    current_text = entry.get()
    new_text = current_text + str(value)
    entry.delete(0, tk.END)
    entry.insert(tk.END, new_text)

def clear_entry():
    entry.delete(0, tk.END)

def calculate_result():
    try:
        current_text = entry.get()
        result = eval(current_text)
        entry.delete(0, tk.END)
        entry.insert(tk.END, str(result))
    except Exception as e:
        entry.delete(0, tk.END)
        entry.insert(tk.END, "Error")

root = tk.Tk()
root.title("Simple Calculator")

entry = tk.Entry(root, width=16, font=('Arial', 24), borderwidth=2, relief='solid', justify='right')
entry.grid(row=0, column=0, columnspan=4, padx=10, pady=10)

buttons = [
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '-',
    '0', '.', '=', '+'
]

row_val = 1
col_val = 0
for button_text in buttons:
    if button_text == '=':
        button = tk.Button(root, text=button_text, width=5, height=2, command=calculate_result)
    elif button_text == 'C':
        button = tk.Button(root, text=button_text, width=5, height=2, command=clear_entry)
    else:
        button = tk.Button(root, text=button_text, width=5, height=2, command=lambda text=button_text: click_button(text))

    button.grid(row=row_val, column=col_val, padx=5, pady=5)
    col_val += 1
    if col_val > 3:
        col_val = 0
        row_val += 1

clear_button = tk.Button(root, text='C', width=5, height=2, command=clear_entry)
clear_button.grid(row=row_val, column=0, padx=5, pady=5)

root.mainloop()
