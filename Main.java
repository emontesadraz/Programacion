// Program to illustrate the working of a static variable in Java
class Util
{
	static int counter = 0;

	public Util() {
		counter++;
	}

	public void getCount() {
		System.out.println("Number of Util instances so far: " + counter);
	}
}

class Main
{
	public static void main(String[] args)
	{
		Util ob1 = new Util();
		ob1.getCount();

		Util ob2 = new Util();
		ob2.getCount();

		Util ob3 = new Util();
		ob3.getCount();
	}
}
