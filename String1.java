import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        String[] ans = UserCode.removeDup(arr);

        for (String s : ans) {
            System.out.println(s);
        }
    }
}

class UserCode {
    public static String[] removeDup(String[] arr) {

        TreeSet<String> set = new TreeSet<>();

        for (String s : arr) {
            set.add(s);   
        }

        String[] out = new String[set.size()];
        int i = 0;

        for (String s : set) {
            out[i++] = s;
        }

        return out;
    }
}
