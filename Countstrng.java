import java.util.Scanner;

public class Countstrng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index = index + s2.length();  
        }

        System.out.println("Occurrences: " + count);
    }
}
