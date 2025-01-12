def read_file(filename):
    try:
        with open(filename, 'r') as file:
            for line in file:
                line = line.strip()
                try:
                    value = int(line)
                    print(f"Integer: {value}")
                except ValueError:
                    try:
                        value = float(line)
                        print(f"Float: {value}")
                    except ValueError:
                        print(f"Character/String: {line}")
    except FileNotFoundError:
        print(f"Error: The file '{filename}' was not found.")
    except IOError as e:
        print(f"Error: An IOError occurred. {e}")

filename = 'test.txt'
read_file(filename)
