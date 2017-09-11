package Oving4_lenket_liste;

/**
 * @author Bjørn Kristian Punsvik
 */
public class xor {
	public static void main(String[] args) {
		long melding = 97568091;
		long nokkel = 999999999;

		long kryptert = melding ^ nokkel;
		System.out.println(kryptert);
		long nyMelding = kryptert ^ nokkel;
		System.out.println(nyMelding);
	}
}
