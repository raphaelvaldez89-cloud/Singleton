package PatronSingleton.exemple1;

public class Client {

	public static void main(String[] args) {
		Singleton.getInstance().op1(1, 2, 3);
		Singleton.getInstance().op2(3, 4, 5);

		//Singleton singl = Singleton.getInstance();
		//singl.op1(1, 2, 3);
		//singl.op2(3, 4, 5);
	}
}
