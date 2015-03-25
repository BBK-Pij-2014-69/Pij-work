package day21;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateClientLauncher {
	public static void main (String[] args) {
		DateClientLauncher myDateClient = new DateClientLauncher();
		myDateClient.launch();
	}
	
	private void launch() {
		// if there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
	
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/date");
			DateService dateService = (DateService) service;
			LocalDate date = dateService.getDate();
			LocalTime time = dateService.getTime();
			System.out.println("Current date is: " + date);
			System.out.println("Current time is: " + time);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (NotBoundException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}
