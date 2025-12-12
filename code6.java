import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(UserMainCode.checkCPTFormat(userInput));
    }
}

class UserMainCode {
    public static boolean checkCPTFormat(String cptCode) {
        return cptCode.matches("CPT-\\d{6}");
    }
}