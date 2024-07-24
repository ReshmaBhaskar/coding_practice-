package coding_javatest;

public class String_alphanumericarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Alternate approach for the above program - output should have unique alpha/ numeric / special char in 
		//different string & also its respective counts
		
		String str = "abdcda12@#a134";
        int digcnt = 0;
        int charcnt = 0;
        int specialcharcnt = 0;
        int[] digcntarr = new int[10];
        int[] alphacntarr = new int[26];
        int[] specialchararr = new int[126];

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digcnt++;
                int digvalue = Character.getNumericValue(c);
                digcntarr[digvalue]++;
            } else if (Character.isLetter(c)) {
                charcnt++;
                char charvalue = Character.toLowerCase(c);
                alphacntarr[charvalue - 'a']++;
            } else {
                specialcharcnt++;
                specialchararr[c]++;
            }
        }

        StringBuilder digstr = new StringBuilder();
        StringBuilder alphastr = new StringBuilder();
        StringBuilder spcharstr = new StringBuilder();

        for (int m = 0; m < digcntarr.length; m++) {
            int digitcnt = digcntarr[m];
            if (digitcnt > 0) {
                digstr.append(m);
            }
        }

        for (int n = 0; n < alphacntarr.length; n++) {
            int alphacnt = alphacntarr[n];
            if (alphacnt > 0) {
                char alphaval = (char) (n + 'a');
                alphastr.append(alphaval);
            }
        }

        for (int p = 0; p < specialchararr.length; p++) {
            int spcharcnt = specialchararr[p];
            //System.out.println(spcharcnt);
            if (spcharcnt > 0) {
                char spcharval = (char) p;
                spcharstr.append(spcharval);
            }
        }

        System.out.println("Special Character Count: " + specialcharcnt);
        System.out.println("Unique Digits: " + digstr);
        System.out.println("Unique Alphabets: " + alphastr);
        System.out.println("Unique Special Characters: " + spcharstr);
 
	}

}
