package com.Innova4D.Interface;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Created by Jose Luis Ballesteros Cruz on 11/03/2015.
 */
public class Moto implements Serializable {

    /**
     * Serial Unique ID
     */
    private static final long serialVersionUID = 32L;

    private int x;
    private int y;
    private String id;

    /**
     * Constructor de la clase moto
     * @param id Nombre de la moto
     * @param x Posicion en x
     * @param y Posicion en Y
     * @throws RemoteException
     */

    public Moto(String id, int x, int y) throws RemoteException {
        super();
        this.id = id;
        this.setX(x);
        this.setY(y);
    }

    public String getId() throws RemoteException  {
        return id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
