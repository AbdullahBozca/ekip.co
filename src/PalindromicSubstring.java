import java.util.Scanner;

public class PalindromicSubstring {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            System.out.println(findLongestPalindromicSubstring(str));
        }

    private static String findLongestPalindromicSubstring(String str) {
        if(str.isEmpty()) {
            return "null";
        }
        int n = str.length();
        int enUzun = 0, ilkIndex = 0, sonIndex = 0;
        boolean[][] palindrom = new boolean[n][n];

        for(int j = 0; j < n; j++) {
            palindrom[j][j] = true;
            for(int i = 0; i < j; i++) {
                if(str.charAt(i) == str.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1])) {
                    palindrom[i][j] = true;
                    if(j-i+1 > enUzun) {
                        enUzun = j-i+1;
                        ilkIndex = i;
                        sonIndex = j;
                    }
                }
            }
        }
        return str.substring(ilkIndex, sonIndex+1);
    }
}
