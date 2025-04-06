package caso3;

public class Contador {
private String nom;
private static int cant=0;
public Contador(String nom) {
	this.nom = nom;
	cant++;
}
public int Cantidad() {
	return cant;
}
}
