/**
 * 
 * @author Lander
 *
 */
public class Hilo5 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread hPing = new Thread(new Hilo("ping"));
		Thread hPong = new Thread(new Hilo2("pong"));
		
		hPing.start();
		hPong.start();
		

	}//main

}//class
