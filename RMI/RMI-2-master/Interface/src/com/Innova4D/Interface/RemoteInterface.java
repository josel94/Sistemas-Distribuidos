package com.Innova4D.Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
	
	/*
	 * Aquí se definen los métodos a implementarse en el servidor.
	 */
	public Object[][] getMapaPistas()  throws RemoteException;
	
	/*
	 * Métodos para el avión
	 */

    /**
     * Registra el avion en la pista
     * @param a el avion se desea hacer checkIn
     * @return
     * @throws RemoteException
     */
	public Boolean checkInAvion(Avion a)      throws RemoteException;

    /**
     * Se obtiene un avion registrado
     * @param id Nombre del avion para su identificacico
     * @param c posicion en la que se encuentra
     * @return
     * @throws RemoteException
     */
	public Avion   getAvion(String id, int c) throws RemoteException;

    /**
     * Se mueve el avion en la pista
     * @param a el avion que se desea mover
     * @param c hacia que position se va a mover
     * @return
     * @throws RemoteException
     */
	public Boolean moverAvion(Avion a, int c) throws RemoteException;
	

	/**
	 * Registra al auto en la pista.
	 * @param a el auto que se desea hacer checkIn.
	 * @return
	 * @throws RemoteException
	 */
	public Boolean checkInAuto(Auto a)       throws RemoteException;

    /**
     * Se obtiene el auto de la pista
     * @param id Nombre del auto
     * @param c Posicion en la pista
     * @return
     * @throws RemoteException
     */
	public Auto    getAuto(String id, int c) throws RemoteException;

    /**
     * Se mueve el auto en la pista
     * @param a Auto que se va a mover
     * @param c Nueva posicion a la que se va a mover el auto
     * @return
     * @throws RemoteException
     */
	public Boolean moverAuto(Auto a, int c)  throws RemoteException;

    /**
     * Registra la moto en la pista
     * @param a la moto que se desea hacer checkIn.
     * @return
     * @throws RemoteException
     */

    public Boolean checkInMoto(Moto a)       throws RemoteException;

    /**
     * Se obtiene la moto de la pista
     * @param id Nombre de la moto
     * @param c Posicion en la pista
     * @return
     * @throws RemoteException
     */
    public Moto    getMoto(String id, int c) throws RemoteException;

    /**
     * Se mueve la moto en la pista
     * @param a La moto que se va a mover
     * @param c Nueva posicion de la moto en la pista
     * @return
     * @throws RemoteException
     */
    public Boolean moverMoto(Moto a, int c)  throws RemoteException;

    /**
     * Registra el segway en la pista
     * @param a el segway que se desea hacer checkIn.
     * @return
     * @throws RemoteException
     */

    public Boolean checkInSegwait(Segwait a)       throws RemoteException;

    /**
     * Se obtiene el segway de la pista
     * @param id Nombre del segway
     * @param c Posicion en la pista
     * @return
     * @throws RemoteException
     */
    public Segwait    getSegwait(String id, int c) throws RemoteException;

    /**
     * Se mueve el segway en la pista
     * @param a El segway se mueve en la posta
     * @param c Nueva posicion del segway en la pista
     * @return
     * @throws RemoteException
     */
    public Boolean moverSegwait(Segwait a, int c)  throws RemoteException;


}
