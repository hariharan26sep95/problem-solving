public class CheckSubStringExist {
    public static void main(String[] args) throws Exception {
        if (checkSubStringExist(args[0],args[1])) {
            System.out.println(args[1] + " substring exist in " + args[0]);
        } else {
            System.out.println(args[1] + " substring not exist in " + args[0]);
        }
    }

    public static Boolean checkSubStringExist(String string, String subString) {
        Boolean isSubStringExist = false;

        for (int charIndex = 0; charIndex <= string.length() - subString.length(); charIndex++) {
            for (int subStringCharIndex = 0; subStringCharIndex < subString.length(); subStringCharIndex++) {
                if (subString.charAt(subStringCharIndex) != string.charAt(charIndex+subStringCharIndex)) {
                    break;
                }

                if (subStringCharIndex == subString.length()-1) {
                    isSubStringExist = true;
                }
            }
            
        }

        return isSubStringExist;
    }
}