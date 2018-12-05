/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Kali
 */
public class CalcRmi extends UnicastRemoteObject implements CalcInterface{
    public CalcRmi() throws RemoteException{
        int a,b;
    }
    public int add(int a,int b) throws RemoteException{
        return a+b;
    }
    public int sub(int a,int b) throws RemoteException{
        return a-b;
    }
    public int mul(int a,int b) throws RemoteException{
        return a*b;
    }
    public int div(int a,int b) throws RemoteException{
        return a/b;
    }
}
