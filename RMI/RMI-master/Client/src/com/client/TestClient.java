package com.client;

import com.interf.test.TestRemote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author   Jose Luis Ballesteros Cruz
 * @version  0.2
 * @since    2015-01-10
 *
 */
public class TestClient {

	public static final String RMI_ID = "TestRMI";
	/**
	 * Define el puerto en donde se encuentra el servidor.
	 */
	public static final int RMI_PORT = 8080;

    /**
     *  Se ejecuta el cliente
     * @param args
     * @throws RemoteException
     * @throws NotBoundException
     */
	public static void main(String[] args) throws RemoteException, NotBoundException {
		//Registry registry = LocateRegistry.getRegistry("140.148.241.228", RMI_PORT);
        Registry registry = LocateRegistry.getRegistry("localhost", RMI_PORT);
		TestRemote remote = (TestRemote) registry.lookup(RMI_ID);
		System.out.println(remote.test("123"));
		System.out.println(remote.test("test"));
        System.out.println(remote.multiplicar(9, 9));
        System.out.println(remote.checarPalindromo("anitanolavalatina"));
	}

}
