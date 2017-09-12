package Oving4_lenket_liste;

/**
 * @author Bjørn Kristian Punsvik
 */
public class Node {
	private double element;
	Node neste;

	public Node(double e, Node n){
		element = e;
		neste = n;
	}

	public double finnElement(){
		return element;
	}

	public Node finnNeste(){
		return neste;
	}

	public void setNeste(Node n){
		this.neste = n;
	}
}
