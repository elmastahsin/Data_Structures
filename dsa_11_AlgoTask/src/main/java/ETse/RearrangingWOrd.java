package ETse;

public class RearrangingWOrd {


        public static void main(String[] args) {
            System.out.println(rearrangeWord("pp"));  // Output: bcaa
        }

        public static String rearrangeWord(String word) {
            char[] chars = word.toCharArray();
            int i = chars.length - 2;
            while (i >= 0 && chars[i] >= chars[i + 1]) {
                i--;
            }
            if (i == -1) {
                return "no answer";
            }
            int j = chars.length - 1;
            while (chars[j] <= chars[i]) {
                j--;
            }
            swap(chars, i, j);
            reverse(chars, i + 1, chars.length - 1);
            return new String(chars);
        }

        private static void swap(char[] chars, int i, int j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        private static void reverse(char[] chars, int i, int j) {
            while (i < j) {
                swap(chars, i++, j--);
            }
        }
    }


