import java.util.*;

class LongestVowels
{

    static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u');
    }

    static int longestVowel(String str)
    {
        int count = 0, res = 0;
        char[] s = str.toCharArray();

        for (int i = 0; i < s.length; i++)
        {

            // Increment current count
            // if s[i] is vowel
            if (isVowel(s[i]))
                count++;

            else
            {
                // check previous value
                // is greater then or not
                res = Math.max(res, count);

                count = 0;
            }
        }

        return res;
    }

    // Driver code
    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
              s = sc.nextLine();
        System.out.println(longestVowel(s));
    }
}