package PatronSingleton.exemple2;

public final class Singleton {
	private static Singleton instance = null;
	public int x;
	public int y;
	private int version = 1 ;

	private Singleton() {
		super();
	}

	private Singleton(int x2, int y2) {
		this.x = x2;
		this.y = y2;
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static Singleton getInstance(int x, int y) {
		if (instance == null) {
			instance = new Singleton(x, y);
		}
		return instance;
	}

	public int somme(int x, int y) {
		return x + y;
	}
	public int puissance(int x, int n) {
    int resultat = 1;
    for (int i = 0; i < n; i++) {
        resultat = resultat * x;
    }
    return resultat;
	}
	public int getVersion() {
    return version;
    }

	

	public int produit(int x, int y) {
		return x * y;
	}

	public void afficher() {
		System.out.println("\n je suis une instance et mes valeurs sont: x= " + this.x + " et y= " + this.y);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
