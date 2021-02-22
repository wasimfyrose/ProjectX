package pages;

public class StringBuild {

	public  void swapNumbers() {
		try {
			String s ="Wasim";
			StringBuilder sb = new StringBuilder();
			String rev = sb.reverse().toString();

			System.out.println(rev);

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		StringBuild s = new StringBuild();
		s.swapNumbers();
		System.out.println("ee");

	}

}
