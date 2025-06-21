import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        String i="hari";
        LinkedList<Character> list = new LinkedList<>();
        for (char c : i.toCharArray()) {
            list.addFirst(c);
        }

        StringBuilder reversed = new StringBuilder();
        for (char c : list) {
            reversed.append(c);
        }

        System.out.println(i);
        System.out.println(reversed.toString());
    }
}
