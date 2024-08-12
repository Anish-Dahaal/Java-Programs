package startpackage;

import java.util.HashMap;
import java.util.Map;

public class CollectionTry {

    public static void main(String[] args) {
        Map<String, Integer> std = new HashMap<>();

        std.put("Anish", 1);
        std.put("Hell", 2);
        std.put("Teeka", 3);
        std.put("Me", 4);
        std.put("Teeka", 32);

        System.out.println(std.keySet());
        for (String key : std.keySet()) {
            System.out.println(key + " : " + std.get(key));
        }
    }
}

// public class CollectionTry {
// public static void main(String[] args) {
// Collection<Integer> c = new TreeSet<Integer>();
// c.add(4);
// c.add(32);
// c.add(23);
// c.add(3);

// Iterator<Integer> values = c.iterator();
// while (values.hasNext()) {
// System.out.println(values.next());
// }

// // for (int n : c) {

// // System.out.println(n);

// // }
// }
// }
