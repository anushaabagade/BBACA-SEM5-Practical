from itertools import combinations

class Set:
    def __init__(self, elements):
        self.elements = elements

    def get_subsets(self):
        """Generate all possible subsets of the set."""
        subsets = []
        for r in range(len(self.elements) + 1):
            subsets.extend(combinations(self.elements, r))
        return [set(subset) for subset in subsets]

    def __str__(self):
        """Return a string representation of the set."""
        return f"Set: {self.elements}"

if __name__ == "__main__":
    elements = list(map(int, input("Enter distinct integers separated by spaces: ").split()))
    
    my_set = Set(elements)
    

    subsets = my_set.get_subsets()
    print("All possible subsets:")
    for subset in subsets:
        print(subset)
