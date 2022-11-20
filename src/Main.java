import java.util.*; // подключение встроенных пакетов

public class Main {

    static boolean isEd(String input) {
        return input.endsWith("ed");
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First task:");
        System.out.println("Input string");

        String s = scanner.next();
        System.out.println(isEd(s));

        Scanner sc = new Scanner(System.in);

        System.out.println("Second task:");
        System.out.println("Input string");

        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) sum += Character.getNumericValue(c);
        }
        System.out.println("Digit sum: " + sum);

        System.out.println("Third task:");
        System.out.println("Input string");

        String sysstr = new Scanner(System.in).nextLine();
        char[] symbol = sysstr.toCharArray();
        int max = 0, j = 0;
        for (int i = 0; i < symbol.length - 1; i++) {
            j++;
            if (symbol[i] != symbol[i + 1]) {
                if (max < j) {
                    max = j;
                }
                j = 0;
            }

        }
        if (max < j)
            max = j;
        System.out.println("The length of the longest character sequence: " + max);

        System.out.println("Fourth task:");
        System.out.println("Input string");


        String[] mass = divide(new Scanner(System.in).nextLine());
        System.out.println("Words: ");
        for (String res : mass){
            System.out.println(res+' ');
        }
    }
    public static String[] divide(String s) {
        ArrayList<String> tmp = new ArrayList<>();
        int count = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                if (j > count) {
                    tmp.add(s.substring(count, j));
                }
                count = j + 1;
            }
        }
        if (count < s.length()) {
            tmp.add(s.substring(count));
        }
        return tmp.toArray(new String[0]);

        }
    }

