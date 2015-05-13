package com.Innova4D.Interface;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Created by Jose Luis Ballesteros Cruz on 11/03/2015.
 */
public class Segwait implements Serializable {
    /**
     * Serial Unique ID
     */
    private static final long serialVersionUID = 22L;

    private int x;
    private int y;
    private String id;

    /**
     * Constructor del segway
     * @param id Nombre del segway
     * @param x Poscion en x
     * @param y Posicion en y
     * @throws RemoteException
     */

    public Segwait(String id, int x, int y) throws RemoteException {
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
