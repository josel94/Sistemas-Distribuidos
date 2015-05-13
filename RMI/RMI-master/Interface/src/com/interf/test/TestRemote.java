package com.interf.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author   Jose Luis Ballesteros Cruz
 * @version  0.1
 * @since    2015-03-04
 */
public interface TestRemote extends Remote{

	/*
	 * En ésta interfaz se definen los métodos que deberá
	 * implementar el servidor.
	 *
	 * En caso de agregar métodos que reciban o envíen objetos
	 * Se debe tener encuenta el serializado de dicho objeto (Marshalling).
	 * Para éste ejemplo definimos un simple método test.
	 *
	 * @param test Un String a comparar, si es idéntico a la palabra "test".
	 *
	 * @return true en caso de que sea idéntico a "test".
	 */
	public Boolean test(String test) throws RemoteException;
    public int multiplicar(int a, int b) throws RemoteException;
    public Boolean checarPalindromo (String palidromo) throws RemoteException;
}
