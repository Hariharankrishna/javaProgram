import java.util.*;
public class kthlargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(30);
        int k = 2;
        Collections.sort(list, Collections.reverseOrder());
        if (k <= list.size()) {
            System.out.println(k+"largest: "+list.get(k-1));
        } else {
            System.out.println("large size");
        }
    }
}
