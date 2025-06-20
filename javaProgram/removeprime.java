import java.util.*;

public class removeprime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1;i<=50;i++)
            list.add(i);

        list.removeIf(n->isPrime(n));

        System.out.println(list);
    }
    static boolean isPrime(int n) {
        if (n<=1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
}

