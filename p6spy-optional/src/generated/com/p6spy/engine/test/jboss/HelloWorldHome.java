/*
 * Generated by XDoclet - Do not edit!
 */
package com.p6spy.engine.test.jboss;

/**
 * Home interface for test/HelloWorld.
 */
public interface HelloWorldHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/test/HelloWorld";
   public static final String JNDI_NAME="ejb/test/HelloWorld";

   public com.p6spy.engine.test.jboss.HelloWorldRemote create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}