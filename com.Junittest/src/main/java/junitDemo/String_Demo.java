package junitDemo;

public class String_Demo {
	public String ReplaceString(String s) {
		char c[]=s.toCharArray();
		String replace_String="";
		for(int i=0;i<c.length;i++) {
			if(i<2) {
				if(c[i]!='A') {
					replace_String+=c[i];
				}
				
			}
			else {
				replace_String+=c[i];
			}
		}
		
		return replace_String;
	}
}
