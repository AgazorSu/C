import java.util.Random;


public class Hilos {

	
	public static void main(String[] args) {
		
		System.out.println("Start");
		Thread t1 = new Thread(new Hilo("One"));
		Thread t2 = new Thread(new Hilo("Two"));
		Thread t3 = new Thread(new Hilo("Three"));
		Thread t4 = new Thread(new Hilo("Four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class Hilo implements Runnable
{

	private String name;
	private int time;
	private Random r = new Random();
	
	public Hilo(String name)
	{
		this.name = name;
		this.time = r.nextInt(999);
	}
	public void run() {
		
		try
		{
			System.out.printf("%s is sleeping for %d\n",name,time);
			Thread.sleep(time);
			System.out.printf("%s is done\n",name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
