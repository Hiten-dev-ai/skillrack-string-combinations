import java.io.*;
import java.util.*;

public class StringCombinations {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> result = new ArrayList<>();
        int n = s.length();

        for (int mask = 1; mask < (1 << n); mask++) {
            StringBuilder current = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    current.append(s.charAt(i));
                }
            }
            result.add(current.toString());
        }

        Collections.sort(result);
        for (String value : result) {
            System.out.println(value);
        }
    }
}
