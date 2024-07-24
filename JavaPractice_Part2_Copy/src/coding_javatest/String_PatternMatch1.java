package coding_javatest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class String_PatternMatch1 {  
    public static String QuestionsMarks(String str) {
        String numMarks = str.replaceAll("[^0-9?]", "");
        System.out.println(numMarks);
        Pattern p = Pattern.compile("(\\d\\?+\\d)");
        Matcher m = p.matcher(numMarks);
        boolean matched = false;
        while (m.find()) {
            String match = m.group();
            System.out.println(match);
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));
            if (a + b == 10) {
                if (match.length() != 5) {
                    return "false";
                } else {
                    matched = true;
                }
            }
        }
        return matched ? "true" : "false";
    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }   
  
}


//'''''''''''''''''''''''easy way to count all question marks in a sentence'''''''''''''''''

//String inputString = "how are you?? dear are you ok??";
//int count = 0;
//for (int i = 0; i < inputString.length(); i++) {
//    if (inputString.charAt(i) == '?') {
//        count++;
//    }
//}
//return count;




