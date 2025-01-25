import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class setbq3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("CPP");
        list.add("Java");
        list.add("Python");
        list.add("PHP");

        System.out.println("Contents of the list using an iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nContents of the list in reverse order using a ListIterator:");
        ListIterator<String> listIterator = list.listIterator(list.size()); // Start from the end
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
