package com.server;

import com.interf.test.TestRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author   José Luis Ballesteros Cruz
 * @version  0.2
 * @since    2015-01-10
 */
public class ServerDefinition extends UnicastRemoteObject implements TestRemote {

	/**
	 * Identificador único de la serialización (Default).
	 */
	private static final long serialVersionUID = 1L;

	protected ServerDefinition() throws RemoteException {
		super();
	}

	@Override
	public Boolean test(String test) throws RemoteException {
		if(test.equalsIgnoreCase("test")) return true;
		return false;
	}

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        return (a * b);
    }

    @Override
    public Boolean checarPalindromo(String palidromo) throws RemoteException {
        int apuntadorInicio;
        int apuntadorFinal;
        /////////////////////////////////////////

        apuntadorInicio = 0;
        apuntadorFinal = palidromo.length()-1;

        while(apuntadorInicio!=apuntadorFinal && palidromo.charAt(apuntadorInicio) == palidromo.charAt(apuntadorFinal)) {
            apuntadorInicio++;
            apuntadorFinal--;
            if(apuntadorInicio==apuntadorFinal && palidromo.charAt(apuntadorInicio) == palidromo.charAt(apuntadorFinal)) {

                return true;
            }
        }
        return false;
    }


}
