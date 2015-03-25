package day21;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class EchoClientLauncher {

	public static void main (String[] args) {
		EchoClientLauncher myEchoClient = new EchoClientLauncher();
		myEchoClient.launch(System.console().readLine());
	}
	
	private void launch(String text) {
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
	
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/echo");
			EchoService echoService = (EchoService) service;
			String receivedEcho = echoService.echo(text);
			System.out.println("receivedEcho is: " + receivedEcho);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}