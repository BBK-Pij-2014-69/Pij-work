package day21;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateServer extends UnicastRemoteObject implements DateService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3952842527987084710L;

	protected DateServer() throws RemoteException {
		super();
	}

	@Override
	public LocalDate getDate() throws RemoteException {
		return LocalDate.now();
	}
	
	public LocalTime getTime() throws RemoteException{
		return LocalTime.now();
	}

}
