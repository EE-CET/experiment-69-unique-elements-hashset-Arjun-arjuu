import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();


        Set<Integer> uniqueSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                uniqueSet.add(sc.nextInt());
            }
        }

        for (Integer num : uniqueSet) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
