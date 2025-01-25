import java.util.*;

public class setcq2 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("Contents of the LinkedList:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nContents of the LinkedList in reverse order:");
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("pink");
        newColors.add("green");

        int indexYellow = colors.indexOf("yellow");

        colors.addAll(indexYellow, newColors);

        System.out.println("\nModified LinkedList with new colors inserted:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
