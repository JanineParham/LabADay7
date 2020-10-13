package main;

public class OuterClass {
	
	public class Inner {
		
		public char[] stringDeconstruct(String str) {
			char[] chars = str.toCharArray();
			return chars;
		}
		
		public char[] newCharArray(char[] chars) {
			char[] newChar = new char[chars.length];
				
			for(int i = 0; i < chars.length; i++) {
				newChar[i] = chars[i];
			}
			return newChar;
		}
	}
}
