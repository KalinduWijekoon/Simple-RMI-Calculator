/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Kali
 */
public interface CalcInterface extends Remote{
    public int add(int x, int y) throws RemoteException;
    public int sub(int x, int y) throws RemoteException;
    public int mul(int x, int y) throws RemoteException;
    public int div(int x, int y) throws RemoteException;
}
