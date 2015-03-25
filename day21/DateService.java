package day21;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.LocalTime;

public interface DateService extends Remote {

	public LocalDate getDate() throws RemoteException;

	public LocalTime getTime() throws RemoteException;
	
}
