import java.util.*;

public class ObjListMain {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // Recorrer la lista usando for tradicional
        System.out.println("Recorrer la lista usando for tradicional:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        
        // Recorrer la lista usando foreach
        System.out.println("\nRecorrer la lista usando foreach:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
        // Recorrer la lista usando while
        System.out.println("\nRecorrer la lista usando while:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
      
        System.out.println("\nRecorrer la lista usando do-while:");
        ListIterator<Integer> listIterator = numbers.listIterator();
        do {
            System.out.println(listIterator.next());
        } while (listIterator.hasNext());
    }
}

