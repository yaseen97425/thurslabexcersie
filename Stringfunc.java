package Javaexamples;

public class Stringfunc {
		public static void main(String[] args) {

	        String name="Mohammed Yaseen";
	        int value= name.length();
	        System.out.println(value);

	        String lstring = name.toLowerCase();
	        System.out.println(lstring);

	        String ustring= name.toUpperCase();
	        System.out.println(ustring);

	        String nontrimstring="     Yaseen     ";
	        System.out.println(nontrimstring);

	        String trimedstring=nontrimstring.trim();
	        System.out.println(trimedstring);


	        System.out.println(name.substring(1,4));
	        System.out.println(name.replace("a","s"));


	}

}
