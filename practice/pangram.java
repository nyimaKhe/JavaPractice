package practice;

public class pangram {

	public static void main(String[] args) {
		String s = "Pack my box with five dozen liquor jugs ";
		String sen = s.toLowerCase();
		
		boolean[] mark = new boolean[26];
		boolean pangram = true;
		int index = 0;
		
		
		for(int i = 0; i < s.length();i++) {
			char curen = sen.charAt(i);
			if(curen >= 'a' && curen <= 'z') {
				index = curen - 'a';
			}
			mark[index] = true;
		}
		
		for (int i = 0; i < mark.length; i++) {
			if(mark[i] == false) {
				pangram = false;
			}
		}
		if(pangram) {
			System.out.println("This sentence is a pangram. ");
		} else {
			System.out.println("Sorry not a pangram.");
		}
	}

}
