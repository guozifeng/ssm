//本地接口Home文件
package com.guo.offer.ejb;

import javax.ejb.*;
import java.util.*;
import java.rmi.*;

public interface TimeFunctionsHome extends javax.ejb.EJBHome {
	public TimeFunctions create() throws CreateException, RemoteException;
}