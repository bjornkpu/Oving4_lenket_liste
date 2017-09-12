package Oving4_lenket_liste;

/**
 * @author Bjørn Kristian Punsvik
 */
public class SirkulaerListe {
	private Node hode = null;
	private int antElementer = 0;

	public int finnAntall(){return antElementer;}

	public Node finnHode(){ return hode;}

	public void settInnFremst(double verdi){

		Node siste = hode;
		while(siste.neste == hode){
			siste = siste.neste;
		}
		hode = new Node(verdi, null);
		siste.neste = hode;
		++antElementer;
	}

	public void settInnBakerst(double verdi){
		if(hode != null) {
			Node denne = hode;
			while(denne.neste != hode){
				denne = denne.neste;
			}
			denne.neste = new Node(verdi, hode);
		} else {
			hode = new Node(verdi, null);
			hode.setNeste(hode);
		}
		++antElementer;
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
				hode = denne.neste;
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

	public void slettAlle() {
		hode = null;
		antElementer = 0;
	}
}
