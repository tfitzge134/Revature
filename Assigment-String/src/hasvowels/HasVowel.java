package hasvowels;

public class HasVowel {
	@SuppressWarnings("unused")
	private static boolean HasVowels(final String input) {
        boolean hasA = false;
        boolean hasE = false;
        boolean hasI = false;
        boolean hasO = false;
        boolean hasU = false;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
            case 'a':
                hasA = true;
                break;
            case 'e':
                hasE = true;
                break;
            case 'i':
                hasI = true;
                break;
            case 'o':
                hasO = true;
                break;
            case 'u':
                hasU = true;
                break;
            default:
                continue;
            }

            if (hasA && hasE && hasI && hasO && hasU) {
                return true;
            }
        }
        return false;
    }


}
