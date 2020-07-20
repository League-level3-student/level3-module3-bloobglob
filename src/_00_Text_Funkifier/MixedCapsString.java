package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%2==1) {
				a += Character.toUpperCase(s.charAt(i));
			}else {
				a+=Character.toLowerCase(s.charAt(i));
			}
		}
		return a;
	}

}
