package day21;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class DateServerLauncher {

	public static void main(String[] args) {
		DateServerLauncher myDate = new DateServerLauncher();
		myDate.launch();

	}

	private void launch() {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			LocateRegistry.createRegistry(1099);
			DateServer server = new DateServer();
			String registryHost = "//localhost/";
			String serviceName = "date";
			Naming.rebind(registryHost + serviceName,  server);
			System.out.println("Server Running");
		} catch(MalformedURLException ex) {
			ex.printStackTrace();
		} catch(RemoteException ex) {
			ex.printStackTrace();
		}
		
	}

}
