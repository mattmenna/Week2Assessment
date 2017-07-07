/**
 * Created by Matt on 7/7/2017.
 */
public class CountVowelString {
    public static void main(String[] args) {
        String input = "How many Vowels in this string?";
        System.out.println(input);
        int endOfInput = input.length();
        int i = 0;
        int countVowel = 0;
        while (i < endOfInput) {
            switch (input.toLowerCase().charAt(i)) {
                case 'a':
                    countVowel += 1;
                    break;
                case 'e':
                    countVowel += 1;
                    break;
                case 'i':
                    countVowel += 1;
                    break;
                case 'o':
                    countVowel += 1;
                    break;
                case 'u':
                    countVowel += 1;
                    break;
                default:
                    break;
            }
            i++;
        }
        System.out.println(countVowel);
    }
}
