/**
 * HelloWorldService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public interface HelloWorldService extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldAddress();

    public client.HelloWorld_PortType getHelloWorld() throws javax.xml.rpc.ServiceException;

    public client.HelloWorld_PortType getHelloWorld(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}