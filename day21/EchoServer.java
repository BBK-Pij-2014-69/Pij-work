package day21;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoServer extends UnicastRemoteObject implements EchoService {

	private static final long serialVersionUID = 7915240552100567389L;

	public EchoServer() throws RemoteException{
		// nothing to initialize for this server
	}
	
	@Override
	public String echo(String s) {
		System.out.println("Replied to some client saying ’" + s + "’"); 
		return s;
	}

}
