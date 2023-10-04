package main;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
        System.out.println(secondSolution(s));

    }

    public static int lengthOfLastWord(String s) {
        String[] strs = s.trim().split(" ");
        String lastWord = strs[strs.length -1 ];
        return lastWord.length();
    }

    public static int secondSolution(String s) {
        int count = 0;
        int j = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(s.length() - 1 - j) == ' ') {
                j++;
                continue;
            } else {
                if(s.charAt(i) != ' ') {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}

//    public int lengthOfLastWord(String s) {
//        int count = 0;
//        int j=0;
//        for(int i=s.length()-1; i>=0; i--) {
//            if(s.charAt(s.length()-1-j) == ' ') {
//                j++;
//                continue;
//            }
//            else {
//                if(s.charAt(i) != ' ') {
//                    count++;
//                }
//                else {
//                    break;
//                }
//            }
//        }
//        return count;
//    }