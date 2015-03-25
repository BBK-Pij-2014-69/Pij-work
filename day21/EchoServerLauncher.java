package day21;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class EchoServerLauncher {

	
	public static void main (String[] args) {
		EchoServerLauncher myEcho = new EchoServerLauncher();
		myEcho.launch();
		
	}
	
	private void launch() {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			LocateRegistry.createRegistry(1099);
			EchoServer server = new EchoServer();
			String registryHost = "//localhost/";
			String serviceName = "echo";
			Naming.rebind(registryHost + serviceName,  server);
			System.out.println("Server Running");
		} catch(MalformedURLException ex) {
			ex.printStackTrace();
		} catch(RemoteException ex) {
			ex.printStackTrace();
		}
		
	
	}
}