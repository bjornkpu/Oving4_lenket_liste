package Oving4_lenket_liste;

/**
 * @author Bjørn Kristian Punsvik
 */
public class SirkulaerListe {
	private Node hode = null;
	private int antElementer = 0;

	public int finnAntall(){return antElementer;}

	public Node finnHode(){ return hode;}

	public void settInnBakerst(double verdi){


	}

	public Node fjern(Node n) {
		Node forige = null;
		Node denne = hode;
		while (denne != null && denne != n) {
			forige = denne;
			denne = denne.neste;
		}
		//Nå viser denne til den søkte, og forige til den forran
		if (denne != null) {
			if (forige != null) {
				forige.neste = denne.neste;
			} else {
				Node siste = hode;
				while(siste.neste != hode){
					siste = siste.neste;
				}
				hode = denne.neste;
				siste.neste = hode;
			}
			denne.neste = null;
			--antElementer;
			return denne;
		} else {
			return null; //Finnes ikke
		}
	}

	public Node finnNr(int nr) {
		Node denne = hode;
		if (nr < antElementer) {
			for (int i = 0; i < nr; i++) {
				denne = denne.neste;
			}
			return denne;
		} else {
			return null;
		}
	}
}
