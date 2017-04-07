package ex2;

public class ReversibleString implements Reversible {
private String string;

	public ReversibleString(String string) {
		this.string=string;
}
	


	
	public String toString() {
		return string;
	}

	public Reversible reverse() {
		String reversedString = "";	
		for (int i = (string.length()-1); i >= 0; i--) {
			reversedString += string.charAt(i);
}
		string=reversedString;
		return this;
	}

}
