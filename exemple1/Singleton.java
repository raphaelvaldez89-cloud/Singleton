package PatronSingleton.exemple1;

public final class Singleton {
	private static Singleton instance = null;
	private String attribut1;
	private int attribut2;

	private Singleton() {
		super();
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void op1(int x, int y, int z) {
		this.attribut1 = "bonjour";
	}

	public void op2(int x, int y, int z) {
	}
}
