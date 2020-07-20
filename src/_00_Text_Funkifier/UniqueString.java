package _00_Text_Funkifier;

public class UniqueString extends SpecialString{

	public UniqueString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				a+=Character.toLowerCase(s.charAt(i));
			}else {
				a+=Character.toUpperCase(s.charAt(i));
			}
		}
		return a;
	}
	
}
