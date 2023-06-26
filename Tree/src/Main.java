import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String str = scanner.nextLine();
        String result = isPangram(str) ? "YES" : "NO";
        System.out.println(result);
    }

    private static boolean isPangram(String str) {
        Set<Character> set = new HashSet<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }

        return set.size() == 26;
    }
}
